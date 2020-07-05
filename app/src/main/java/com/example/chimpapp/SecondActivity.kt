package com.example.chimpapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val grid = arrayListOf<Button>(button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25, button26, button27, button28)
        var x = 1
        while(x<=5){
            val rand = (0..27).random()
            if(grid[rand].text==""){
                grid[rand].text = x.toString()
                grid[rand].visibility = View.VISIBLE
                x++
            }
        }
    }
}