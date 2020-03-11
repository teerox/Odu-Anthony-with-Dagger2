package com.example.oduanthony.screens.carowner

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.example.oduanthony.BaseApplication
import com.example.oduanthony.R
import com.example.oduanthony.databinding.FragmentCarOwnerBinding
import com.example.oduanthony.model.CarOwner
import com.example.oduanthony.model.CarOwnerList
import com.example.oduanthony.model.Filter
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.*
import javax.inject.Inject

///**
// * A simple [Fragment] subclass.
// */
class CarOwnerFragment : Fragment() {

    lateinit var binding: FragmentCarOwnerBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: CarOwnerAdapter
    var arrayUser = arrayListOf<CarOwner>()

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var carOwnerViewModel: CarOwnerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        (activity!!.application as BaseApplication).getSharedComponent().inject(this)

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_car_owner,container,false)

        carOwnerViewModel = ViewModelProvider(this, viewModelFactory).get(CarOwnerViewModel::class.java)


        recyclerView = binding.carOwnerRecy
        var args = CarOwnerFragmentArgs.fromBundle(arguments!!).Filterlist

         val filterResult = MutableLiveData<CarOwnerList>()


        GlobalScope.launch(Dispatchers.Main){
           val result = carOwnerViewModel.filterFile(args)
            arrayUser.addAll(result)
            adapter = CarOwnerAdapter(requireContext(), arrayUser)
            recyclerView.adapter = adapter
            binding.progressbar2.visibility = View.GONE
            Log.e("Filtered Result", result.toString())
            val total = result.size
            Snackbar.make(binding.root,total.toString(), Snackbar.LENGTH_LONG).show()
        }





        carOwnerViewModel.isDbAvailable.observe(viewLifecycleOwner, Observer {
            if(!it){
                Snackbar.make(binding.root,"No List Available", Snackbar.LENGTH_LONG).show()

            }
        })

        return binding.root
    }

}
