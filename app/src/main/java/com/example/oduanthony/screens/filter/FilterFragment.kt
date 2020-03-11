package com.example.oduanthony.screens.filter

import android.Manifest
import android.app.Dialog
import android.content.pm.PackageManager
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.downloader.PRDownloader
import com.downloader.PRDownloaderConfig
import com.example.oduanthony.BaseApplication
import com.example.oduanthony.R
import com.example.oduanthony.Utility.MY_PERMISSIONS_REQUEST_WRITE_STORAGE
import com.example.oduanthony.databinding.FragmentFilterBinding
import com.example.oduanthony.model.Filter
import com.example.oduanthony.networkUtlis.NetworkChangeReceiver
import com.google.android.material.snackbar.Snackbar
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 */
class FilterFragment : Fragment(){
    lateinit var binding: FragmentFilterBinding
    lateinit var recyclerView: RecyclerView

   @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var filterViewModel: FilterViewModel


    lateinit var adapter: FilterListAdapter
    var arrayUser = arrayListOf<Filter>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity!!.application as BaseApplication).getSharedComponent().inject(this)

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_filter,container,false)

        filterViewModel = ViewModelProvider(this, viewModelFactory).get(FilterViewModel::class.java)


        //Check for Permission
        checkPermissionAndStart()


        //Initialize Download
        val config = PRDownloaderConfig.newBuilder().setDatabaseEnabled(true).build()
        PRDownloader.initialize(context, config)


        recyclerView = binding.allFilter


        filterViewModel.isLoading().observe(viewLifecycleOwner, Observer {
           isloading ->
            if (isloading){
                binding.progressbar.visibility = View.VISIBLE
            }else{
                binding.progressbar.visibility = View.GONE
            }
        })
        filterViewModel.errorDisplay().observe(viewLifecycleOwner, Observer { error ->
            Log.e("Home", error.toString())
        })

        filterViewModel.loadData()?.observe(viewLifecycleOwner, Observer {
            if (it.isEmpty()) {
                adapter = FilterListAdapter(requireContext(), arrayUser) {}
                recyclerView.adapter = adapter
                binding.progressbar.visibility = View.VISIBLE
            }else{
                Log.e("All", it.toString())
                arrayUser.addAll(it)
                adapter = FilterListAdapter(requireContext(), arrayUser) {filter->
                    val action = FilterFragmentDirections.actionFilterFragmentToAllFilter(filter)
                    findNavController().navigate(action)
                    Log.e("All", "You Clicked")
                }
                recyclerView.adapter = adapter
                binding.progressbar.visibility = View.GONE
            }
        })


        //reciever = NetworkChangeReceiver()

        filterViewModel.startDialogDownload.observe(viewLifecycleOwner, Observer {
            if (!it) {
             filterViewModel.showDialog()
                Snackbar.make(binding.root,"Downloaded Started",Snackbar.LENGTH_LONG).show()

            }
        })
        filterViewModel.completeDownload.observe(viewLifecycleOwner, Observer { isCompleted ->
            isCompleted?.let { result ->
                if (result) {
                    filterViewModel.dismiss()
                    Snackbar.make(binding.root,"Downloaded Completed",Snackbar.LENGTH_LONG).show()
                }
            }
        })

        return binding.root

    }

    //METHOD TO CHECK PERMISSION
    private fun checkPermissionAndStart() {
        if (ContextCompat.checkSelfPermission(
                context!!,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            )
            != PackageManager.PERMISSION_GRANTED
        ) {
            promptDialogPermission()

        } else {
            filterViewModel
            filterViewModel.grantAccess.value = true
        }
    }



    private fun promptDialogPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(
                arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                MY_PERMISSIONS_REQUEST_WRITE_STORAGE
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            MY_PERMISSIONS_REQUEST_WRITE_STORAGE -> {
                if ((grantResults.isNotEmpty() && permissions[0] == Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                    if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        filterViewModel.checkDataExist()
                        filterViewModel.grantAccess.value = true
                    }
                } else {
                    promptDialogPermission()
                }

            }


        }
    }





}
