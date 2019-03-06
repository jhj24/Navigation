package com.jhj.navigation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        navigation_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.fragmentOne -> {
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.fragmentTwo -> {
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.fragmentThree -> {
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.fragmentFour -> {
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false

        }

        val navHostFragment = fragment as NavHostFragment
        NavigationUI.setupWithNavController(navigation_view, navHostFragment.navController)
    }

}
