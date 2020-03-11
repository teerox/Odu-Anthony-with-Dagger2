package com.example.oduanthony.screens.filter

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Environment
import android.util.Log
import android.view.Window
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.downloader.OnDownloadListener
import com.downloader.PRDownloader
import com.example.oduanthony.DownloadProgress
import com.example.oduanthony.R
import com.example.oduanthony.download.Download
import com.example.oduanthony.download.Download.CAR_OWNER_DATA
import com.example.oduanthony.model.Filter
import com.example.oduanthony.model.FilterArray
import com.example.oduanthony.repository.FilterRepo
import retrofit2.Call
import retrofit2.Response
import java.io.File
import javax.inject.Inject
import javax.security.auth.callback.Callback

class FilterViewModel @Inject constructor(private val filterRepository: FilterRepo, private val dialog: DownloadProgress):ViewModel(){



    private val isLoading = MutableLiveData<Boolean>()
    private val errorDisplay = MutableLiveData<String>()



    fun isLoading(): LiveData<Boolean> {
        return isLoading
    }

    fun errorDisplay(): LiveData<String> {
        return errorDisplay
    }


    fun loadData():MutableLiveData<FilterArray>? {
        val data = arrayListOf<Filter>()
        val filter: MutableLiveData<FilterArray>? = MutableLiveData()
        isLoading.value = true
        val call = filterRepository.getFilterRepo()

        call.enqueue(object : Callback, retrofit2.Callback<FilterArray> {
            override fun onFailure(call: Call<FilterArray>, t: Throwable) {
                filter?.value = data
            }

            override fun onResponse(call: Call<FilterArray>, response: Response<FilterArray>) {
                if (response.isSuccessful) {
                    filter?.value = response.body()
                }
            }
        })
        return filter
    }


    private val file by lazy {
        File(
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS),
            Download.FOLDER
        )
    }
    private val absoluteFile by lazy {
        File(
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS),
            Download.FOLDER.plus("/$CAR_OWNER_DATA")
        )
    }


    private val _startDialogDownload = MutableLiveData<Boolean>()
    val startDialogDownload: LiveData<Boolean>
        get() = _startDialogDownload

    private val _completeDownload = MutableLiveData<Boolean>()
    val completeDownload: LiveData<Boolean>
        get() = _completeDownload


    val grantAccess = MutableLiveData<Boolean>()


    fun checkDataExist() {
        if (!absoluteFile.exists()) {
            _startDialogDownload.value = false
            startDownload()
        }
        Log.e("Data","Data Exist")

    }


    private fun startDownload(): Int {
        if (!file.exists()) file.mkdir()
        return PRDownloader.download(
            Download.DOWNLOAD_URL,
            file.absolutePath,
            CAR_OWNER_DATA
        )
            .build()
            .setOnStartOrResumeListener {
               Log.e("Started","Started")
            }
            .setOnPauseListener {
                Log.e("Pause","Pause")
            }
            .setOnCancelListener {
                Log.e("Cancel","Cancel")
            }
            .setOnProgressListener { }
            .start(object : OnDownloadListener {
                override fun onDownloadComplete() {
                    _completeDownload.value = true
                    grantAccess.value = true
                    Log.e("Completed","Completed")
                }

                override fun onError(error: com.downloader.Error?) {
                   Log.e("error",error?.serverErrorMessage.toString())
                    _completeDownload.value = true

                }
            })


    }


    fun showDialog(){
        Log.e("Dialogue","Dialogue On")
        dialog.showDialog()
    }

    fun dismiss() {
        Log.e("Dialogue","Dialogue Off")
        dialog.dismiss()
    }
}