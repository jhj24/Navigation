package com.jhj.navigation

import android.content.res.ColorStateList
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        navigation_view.itemTextColor = selected(0xffff00000.toInt(), 0xff00ffff.toInt())

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


    fun selected(selectedColor: Int, normalColor: Int): ColorStateList {
        val states = arrayOfNulls<IntArray>(2)
        states[0] = intArrayOf(android.R.attr.state_selected, android.R.attr.state_enabled)
        states[1] = intArrayOf()
        val colors = intArrayOf(selectedColor, normalColor)
        return ColorStateList(states, colors)
    }
}
