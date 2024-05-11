package com.zas.scoreboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.credentials.CredentialManager
import androidx.credentials.GetCredentialRequest
import androidx.credentials.exceptions.GetCredentialException
import com.google.android.libraries.identity.googleid.GetGoogleIdOption
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException
import com.zas.scoreboard.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import java.security.MessageDigest
import java.util.UUID

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    val coroutineScope = CoroutineScope(
        Job() + Dispatchers.Main
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.signin.setOnClickListener {
            val credentialManager = CredentialManager.create(applicationContext)

            val rawNonce = UUID.randomUUID().toString()
            val byteArr = rawNonce.toByteArray()
            val md = MessageDigest.getInstance("SHA-256")
            val digest = md.digest(byteArr)
            val hashedNonce = digest.fold("") {str, it -> str + ("%02x".format(it))}

            val googleIdOption: GetGoogleIdOption = GetGoogleIdOption.Builder()
                .setFilterByAuthorizedAccounts(false)
                .setServerClientId("46514229573-bq4s0r5o9dbicdss3piq7urvuc3go9vl.apps.googleusercontent.com")
                .setNonce(hashedNonce)
                .build()

            val request: GetCredentialRequest = GetCredentialRequest.Builder()
                .addCredentialOption(googleIdOption)
                .build()

            coroutineScope.launch {
                try {
                    val result = credentialManager.getCredential(
                        request = request,
                        context = this@MainActivity
                    )
                    val credential = result.credential

                    val googleIdTokenCredential =
                        GoogleIdTokenCredential.createFrom(credential.data)
                    val googleIdToken = googleIdTokenCredential.idToken
                    Log.d("TAG", "Token: $googleIdToken")
                    Toast.makeText(applicationContext, "Signed In.", Toast.LENGTH_SHORT).show()
                } catch (e: GetCredentialException){
                    e.printStackTrace()
                    Toast.makeText(applicationContext, "Sign error.", Toast.LENGTH_SHORT).show()
                } catch (e: GoogleIdTokenParsingException) {
                    e.printStackTrace()
                    Toast.makeText(applicationContext, "ID Parse error.", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}