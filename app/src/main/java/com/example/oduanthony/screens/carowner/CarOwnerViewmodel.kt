package com.example.oduanthony.screens.carowner
//
import android.os.Environment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.oduanthony.Utility
import com.example.oduanthony.download.Download
import com.example.oduanthony.model.CarOwnerList
import com.example.oduanthony.model.Filter
import com.example.oduanthony.repository.FilterRepo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.withContext
import java.io.File
import javax.inject.Inject

class CarOwnerViewModel @Inject constructor(var carOwnerRepo:FilterRepo):ViewModel(){

    private var viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

        private val absoluteFile by lazy {
        File(
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS),
            Download.FOLDER.plus("/${Download.CAR_OWNER_DATA}")
        )
    }

    private var filterResult = MutableLiveData<CarOwnerList>()
//    val filterResult: LiveData<CarOwnerList>
//        get() = _filterResult


    private var _isDbAvailable = MutableLiveData<Boolean>()
    val isDbAvailable: LiveData<Boolean>
        get() = _isDbAvailable


    init {
        _isDbAvailable.value = absoluteFile.exists()
    }


    private suspend fun readFile():CarOwnerList{
           return Utility.readFile(absoluteFile)
    }



     suspend fun filterFile(data: Filter):CarOwnerList{
        return withContext(Dispatchers.IO) {
            val fileList = readFile()
            val result = Utility.filter(fileList, data)
            result
        }


     }


}