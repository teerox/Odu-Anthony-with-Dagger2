package com.example.oduanthony

import android.os.Build
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.oduanthony.model.Filter
import kotlinx.coroutines.*
import kotlinx.coroutines.test.setMain
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config


@RunWith(AndroidJUnit4::class)
@Config(sdk = [Build.VERSION_CODES.O_MR1])
class FilterTest {

    @ObsoleteCoroutinesApi
    private val mainThreadSurrogate = newSingleThreadContext("UI thread")
    private val carOwners = FakeData.data

    @ExperimentalCoroutinesApi
    @Before
    fun setUp(){
        Dispatchers.setMain(mainThreadSurrogate)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun filter_should_return_correct_list_size_where_all_color_and_all_gender(){
        runBlocking {
            launch(Dispatchers.Main) {
                val myFilterFunction = Utility
                val filter = Filter(
                    "1",
                    "",
                    "",
                    "",
                    "",
                    listOf(),
                    listOf(
                        "China",
                        "South Africa",
                        "france",
                        "Mexico",
                        "Japan",
                        "Estonia",
                        "Colombia",
                        "China"
                    )
                )
                val filteredList =  myFilterFunction.filter(carOwners,filter)
                Assert.assertEquals(1, filteredList.size)
            }

        }
    }



    @ExperimentalCoroutinesApi
    @Test
    fun filter_should_return_correct_list_size_for_no_match_filter(){
        runBlocking {
            launch(Dispatchers.Main) {
                val myFilterFunction = Utility
                val filter = Filter(
                    "1",
                    "",
                    "",
                    "",
                    "female",
                    listOf(""),
                    listOf(
                        "China",
                        "South Africa",
                        "france",
                        "Mexico",
                        "Japan",
                        "Estonia",
                        "Colombia",
                        "China"
                    )
                )
                val filteredList =  myFilterFunction.filter(carOwners,filter)
                Assert.assertEquals(0, filteredList.size)
            }

        }
    }


    @ExperimentalCoroutinesApi
    @Test
    fun filter_should_return_correct_list_size_for_different_gender(){
        runBlocking {
            launch(Dispatchers.Main) {
                val myFilterFunction = Utility
                val filter = Filter(
                    "1",
                    "",
                    "",
                    "",
                    "female",
                    listOf("Puce"),
                    listOf("Bolivia", "France")
                )
                val filteredList =  myFilterFunction.filter(carOwners,filter)
                Assert.assertEquals(1, filteredList.size)
            }

        }
    }



}