package com.example.oduanthony


import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.*
import javax.inject.Inject


class DownloadProgress @Inject constructor(private var activity:Context?){
    private val dialog = Dialog(activity!!)
    fun showDialog() {
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)
        dialog.setContentView(R.layout.downloadview)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
    }

    fun dismiss() {
        dialog.dismiss()
    }

}