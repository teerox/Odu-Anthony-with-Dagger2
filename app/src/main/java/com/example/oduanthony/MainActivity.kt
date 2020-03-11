package com.example.oduanthony

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.oduanthony.networkUtlis.NetworkChangeReceiver
import com.example.oduanthony.networkUtlis.NetworkUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navController: NavController
    lateinit var reciever: NetworkChangeReceiver


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        navController = this.findNavController(R.id.navHost)
        NavigationUI.setupActionBarWithNavController(this, navController)
        appBarConfiguration = AppBarConfiguration(navController.graph)

       val connection = NetworkUtil.getConnectivityStatus(this)
        reciever = NetworkChangeReceiver()
        if(connection == 0){
            Toast.makeText(this,"No Network",Toast.LENGTH_LONG).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        // Toast.makeText(this, "BackPressed", Toast.LENGTH_LONG).show()
        finish()
    }
}
