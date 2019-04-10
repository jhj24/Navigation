package com.jhj.navigation

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.support.design.internal.BottomNavigationItemView
import android.support.design.internal.BottomNavigationMenuView
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.backgroundDrawable
import org.jetbrains.anko.dip
import org.jetbrains.anko.textColor
import org.jetbrains.anko.wrapContent

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


//小红点
        val menuView = navigation_view.getChildAt(0)
        val messageNum = 9
        if (messageNum > 0 && menuView != null && menuView is BottomNavigationMenuView) {
            val messageItemView = menuView.getChildAt(2) as BottomNavigationItemView
            val textView = TextView(this).apply {
                text = messageNum.toString()
                gravity = Gravity.CENTER
                textColor = Color.WHITE
                textSize = 10f
                backgroundDrawable = ContextCompat.getDrawable(this@MainActivity, R.drawable.shape_message_dot)
                val layoutParams = FrameLayout.LayoutParams(wrapContent, wrapContent)
                layoutParams.topMargin = dip(6)
                layoutParams.leftMargin = dip(15)
                layoutParams.gravity = Gravity.CENTER_HORIZONTAL
                setLayoutParams(layoutParams)
            }
            messageItemView.addView(textView)
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
