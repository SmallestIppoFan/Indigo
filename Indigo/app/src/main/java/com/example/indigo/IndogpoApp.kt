package com.example.indigo

import android.app.Application
import com.onesignal.OneSignal
import dagger.hilt.android.HiltAndroidApp

const val ONESIGNAL_APP_ID = "15ea1710-7f60-4e7e-8823-7f6b234dd956"


@HiltAndroidApp
class IndogpoApp:Application() {
    override fun onCreate() {
        super.onCreate()

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)

        OneSignal.promptForPushNotifications();
    }
}