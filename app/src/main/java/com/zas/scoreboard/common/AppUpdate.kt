package com.zas.scoreboard.common

import android.util.Log
//import com.google.android.play.core.appupdate.AppUpdateInfo
//import com.google.android.play.core.appupdate.AppUpdateManager
//import com.google.android.play.core.appupdate.AppUpdateManagerFactory
//import com.google.android.play.core.install.InstallStateUpdatedListener
//import com.google.android.play.core.install.model.AppUpdateType
//import com.google.android.play.core.install.model.InstallStatus
//import com.google.android.play.core.install.model.UpdateAvailability
//import com.zas.scoreboard.activity.BaseFullscreenActivity

class AppUpdate /*internal constructor(
    private val activity: BaseFullscreenActivity,
    private var appUpdateCallBack: AppUpdateCallBack? = null
)*/ {

//    init {
//        instance = this
//    }
//
//    private val className = javaClass.simpleName
//
//    fun checkAppUpdate() {
//        val methodName = Thread.currentThread().stackTrace[2].methodName
//        Log.i(Constants.LOG_TAG, "${Constants.LOG_ENTER} $className - $methodName")
//        appUpdateManager = AppUpdateManagerFactory.create(activity)
//
//        val appUpdateInfoTask = appUpdateManager.appUpdateInfo
//
//        appUpdateInfoTask.addOnFailureListener {
//            it.printStackTrace()
//            appUpdateCallBack?.onFailure()
//        }
//        appUpdateInfoTask.addOnSuccessListener { tMppUpdateInfo ->
//            appUpdateInfo = tMppUpdateInfo
//            Log.d(Constants.LOG_TAG, "Update status: ${tMppUpdateInfo.availableVersionCode()} ${appUpdateInfo.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE}")
//            if (appUpdateInfo.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE &&
//                appUpdateInfo.isUpdateTypeAllowed(appUpdateType)
//            ) {
//                startUpdate()
//            } else {
//                appUpdateCallBack?.onUpToDate()
//            }
//        }
//        Log.i(Constants.LOG_TAG, "${Constants.LOG_EXIT} $className - $methodName")
//    }
//
//    private fun startUpdate() {
//        val methodName = Thread.currentThread().stackTrace[2].methodName
//        Log.i(Constants.LOG_TAG, "${Constants.LOG_ENTER} $className - $methodName")
//        appUpdateCallBack?.onUpdateAvailable()
//        appUpdateManager.startUpdateFlowForResult(
//            appUpdateInfo, appUpdateType,
//            activity, Constants.REQUEST_APP_UPDATE
//        )
//        if (appUpdateType == AppUpdateType.FLEXIBLE) appUpdateManager.registerListener(listener)
//        Log.i(Constants.LOG_TAG, "${Constants.LOG_EXIT} $className - $methodName")
//    }
//
//    fun onResume() {
//        if (appUpdateType == AppUpdateType.IMMEDIATE) {
//            appUpdateManager
//                .appUpdateInfo
//                .addOnSuccessListener { appUpdateInfo ->
//                    if (appUpdateInfo.updateAvailability()
//                        == UpdateAvailability.DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS
//                    ) {
//                        appUpdateManager.startUpdateFlowForResult(
//                            appUpdateInfo,
//                            AppUpdateType.IMMEDIATE,
//                            activity,
//                            Constants.REQUEST_APP_UPDATE
//                        )
//                    }
//                }
//        }
//    }
//
//    fun completeUpdate() {
//        appUpdateManager.completeUpdate()
//    }
//
//    class Builder(contextActivity: BaseFullscreenActivity){
//
//        private val activity: BaseFullscreenActivity = contextActivity
//        private var appUpdateCallBack: AppUpdateCallBack? = null
//
//        fun addAppUpdateCallBack(appUpdateCallBack: AppUpdateCallBack?) = apply { this.appUpdateCallBack = appUpdateCallBack }
//
//        fun build() = AppUpdate(activity, appUpdateCallBack)
//    }
//
//    companion object {
//        private const val appUpdateType: Int = AppUpdateType.FLEXIBLE
//        private lateinit var appUpdateManager: AppUpdateManager
//        private lateinit var appUpdateInfo: AppUpdateInfo
//
//        var instance: AppUpdate? = null
//
//        private val listener: InstallStateUpdatedListener =
//            InstallStateUpdatedListener { installState ->
//                if (installState.installStatus() == InstallStatus.DOWNLOADED) {
//                    unregisterDownloadListener()
//                    instance?.appUpdateCallBack?.onSuccess()
//                }
//                if (installState.installStatus() == InstallStatus.DOWNLOADING) {
//                    val bytesDownloaded = installState.bytesDownloaded()
//                    val totalBytesToDownload = installState.totalBytesToDownload()
//                    instance?.appUpdateCallBack?.onProgress(bytesDownloaded, totalBytesToDownload)
//                }
//            }
//
//        private fun unregisterDownloadListener() {
//            appUpdateManager.unregisterListener(listener)
//        }
//    }
//
//    interface AppUpdateCallBack {
//        fun onFailure()
//        fun onUpdateAvailable()
//        fun onUpToDate()
//        fun onProgress(downloaded: Long, total: Long)
//        fun onSuccess()
//    }
}