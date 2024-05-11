package com.zas.scoreboard.signin

import android.app.Activity
import android.content.Context
import android.util.Log
import androidx.credentials.CredentialManager
import androidx.credentials.CustomCredential
import androidx.credentials.GetCredentialRequest
import androidx.credentials.GetCredentialResponse
import androidx.credentials.PasswordCredential
import androidx.credentials.PublicKeyCredential
import androidx.credentials.exceptions.GetCredentialException
import androidx.credentials.exceptions.NoCredentialException
import com.google.android.libraries.identity.googleid.GetGoogleIdOption

class MySignIn(private val context: Context) {
//    val TAG = "TAG"
//
//    val credentialManager = CredentialManager.create(context)
//    var signInCallBack: SignInCallBack? = null

//    var account: GoogleSignInAccount? = null
//    private var mGoogleSignInClient: GoogleSignInClient? = null

    fun handleSignIn(result: GetCredentialResponse) {
//        // Handle the successfully returned credential.
//        val credential = result.credential
//
//        when (credential) {
//            is PublicKeyCredential -> {
//                val responseJson = credential.authenticationResponseJson
//                // Share responseJson i.e. a GetCredentialResponse on your server to
//                // validate and  authenticate
//            }
//            is PasswordCredential -> {
//                val username = credential.id
//                val password = credential.password
//                // Use id and password to send to your server to validate
//                // and authenticate
//            }
//            is CustomCredential -> {
//                // If you are also using any external sign-in libraries, parse them
//                // here with the utility functions provided.
//                if (credential.type == ExampleCustomCredential.TYPE)  {
//                    try {
//                        val ExampleCustomCredential = ExampleCustomCredential.createFrom(credential.data)
//                        // Extract the required credentials and complete the authentication as per
//                        // the federated sign in or any external sign in library flow
//                    } catch (e: ExampleCustomCredential.ExampleCustomCredentialParsingException) {
//                        // Unlikely to happen. If it does, you likely need to update the dependency
//                        // version of your external sign-in library.
//                        Log.e(TAG, "Failed to parse an ExampleCustomCredential", e)
//                    }
//                } else {
//                    // Catch any unrecognized custom credential type here.
//                    Log.e(TAG, "Unexpected type of credential")
//                }
//            } else -> {
//            // Catch any unrecognized credential type here.
//            Log.e(TAG, "Unexpected type of credential")
//        }
//        }
    }

    fun init() {
//        coroutineScope.launch {
//            try {
//                val result = credentialManager.getCredential(
//                    // Use an activity-based context to avoid undefined system UI
//                    // launching behavior.
//                    context = context,
//                    request = getCredRequest
//                )
//                handleSignIn(result)
//            } catch (e : GetCredentialException) {
//                handleFailure(e)
//            }
//        }
//        account = GoogleSignIn.getLastSignedInAccount(context)
//        initGoogleSignIn()
    }

    private fun initGoogleSignIn() {
//        GetGoogleIdOption.Builder().setAutoSelectEnabled(true).
//        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//            .requestEmail()
//            .build()
//        mGoogleSignInClient = GoogleSignIn.getClient(context, gso)
    }

    fun signIn(activity: Activity) {
//        val signInIntent = mGoogleSignInClient!!.signInIntent
//        activity.startActivityForResult(signInIntent, Constants.REQUEST_GOOGLE_SIGN_IN)
    }

    fun signOut(activity: Activity) {
//        mGoogleSignInClient!!.signOut().addOnCompleteListener(activity) {
//            account = null
//            signInCallBack?.updateUI()
//        }
    }
}

interface SignInCallBack {
    fun updateUI()
}