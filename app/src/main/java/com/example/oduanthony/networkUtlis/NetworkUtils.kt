package com.example.oduanthony.networkUtlis

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo


object NetworkUtil {
    const val TYPE_WIFI = 1
    const val TYPE_MOBILE = 2
    const val TYPE_NOT_CONNECTED = 0
    const val NETWORK_STATUS_NOT_CONNECTED = 0
    const val NETWORK_STATUS_WIFI = 1
    const val NETWORK_STATUS_MOBILE = 2

    const val NETWORK_CONNECTED = 1
    const val NETWORK_NOT_CONNECTED = 0


    fun getConnectivityStatus(context: Context): Int {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = cm.activeNetworkInfo
        val isConnected: Boolean = activeNetwork?.isConnectedOrConnecting == true

        if (isConnected){
            return NETWORK_CONNECTED
        }
        return NETWORK_NOT_CONNECTED
    }

    fun getConnectivityStatusString(context: Context): Int {
        val conn =
            getConnectivityStatus(
                context
            )
        var status = 0
        if (conn == TYPE_WIFI) {
            status =
                NETWORK_STATUS_WIFI
        } else if (conn == TYPE_MOBILE) {
            status =
                NETWORK_STATUS_MOBILE
        } else if (conn == TYPE_NOT_CONNECTED) {
            status =
                NETWORK_STATUS_NOT_CONNECTED
        }
        return status
    }
}