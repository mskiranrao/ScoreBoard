package com.zas.scoreboard

import android.app.Application
//import com.dbflow5.config.FlowConfig
//import com.dbflow5.config.FlowManager
//import com.google.android.gms.ads.MobileAds
//import com.google.firebase.analytics.ktx.analytics
//import com.google.firebase.crashlytics.ktx.crashlytics
//import com.google.firebase.ktx.Firebase
//import com.google.firebase.ktx.app
//import com.google.firebase.ktx.options
import com.zas.scoreboard.signin.MySignIn

class AppController: Application() {
    private val className = javaClass.simpleName

    val signIn = MySignIn(this)

    override fun onCreate() {
        super.onCreate()
//        Firebase.crashlytics.setCrashlyticsCollectionEnabled(true)
//        FlowManager.init(FlowConfig.Builder(this).build())
//        MobileAds.initialize(this)
    }
}