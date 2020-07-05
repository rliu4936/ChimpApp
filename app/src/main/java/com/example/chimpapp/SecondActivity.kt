package com.example.chimpapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val amount = 10
        generate(amount)
        val regenerate = findViewById<Button>(R.id.regenerateButton)
        regenerate.setOnClickListener{
            regenerate(amount)
        }
        val grid = arrayListOf<Button>(button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24)
        grid[0].setOnClickListener(this)
        grid[1].setOnClickListener(this)
        grid[2].setOnClickListener(this)
        grid[3].setOnClickListener(this)
        grid[4].setOnClickListener(this)
        grid[5].setOnClickListener(this)
        grid[6].setOnClickListener(this)
        grid[7].setOnClickListener(this)
        grid[8].setOnClickListener(this)
        grid[9].setOnClickListener(this)
        grid[10].setOnClickListener(this)
        grid[11].setOnClickListener(this)
        grid[12].setOnClickListener(this)
        grid[13].setOnClickListener(this)
        grid[14].setOnClickListener(this)
        grid[15].setOnClickListener(this)
        grid[16].setOnClickListener(this)
        grid[17].setOnClickListener(this)
        grid[18].setOnClickListener(this)
        grid[19].setOnClickListener(this)
        grid[20].setOnClickListener(this)
        grid[21].setOnClickListener(this)
        grid[22].setOnClickListener(this)
        grid[23].setOnClickListener(this)
    }
    private fun generate(amount: Int){
        var x = 1
        val grid = arrayListOf<Button>(button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24)
        while(x<=amount){
            val rand = (0..23).random()
            if(grid[rand].text==""){
                grid[rand].text = x.toString()
                grid[rand].visibility = View.VISIBLE
                x++
            }
        }
    }
    private fun regenerate(amount: Int){
        val grid = arrayListOf<Button>(button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24)
        for(button in grid){
            button.text = ""
            button.visibility = View.INVISIBLE
        }
        generate(amount)
    }

    override fun onClick(v: View) {
        when(v.id){
            button1.id -> button1.visibility = View.INVISIBLE
            button2.id -> button2.visibility = View.INVISIBLE
            button3.id -> button3.visibility = View.INVISIBLE
            button4.id -> button4.visibility = View.INVISIBLE
            button5.id -> button5.visibility = View.INVISIBLE
            button6.id -> button6.visibility = View.INVISIBLE
            button7.id -> button7.visibility = View.INVISIBLE
            button8.id -> button8.visibility = View.INVISIBLE
            button9.id -> button9.visibility = View.INVISIBLE
            button10.id -> button10.visibility = View.INVISIBLE
            button11.id -> button11.visibility = View.INVISIBLE
            button12.id -> button12.visibility = View.INVISIBLE
            button13.id -> button13.visibility = View.INVISIBLE
            button14.id -> button14.visibility = View.INVISIBLE
            button15.id -> button15.visibility = View.INVISIBLE
            button16.id -> button16.visibility = View.INVISIBLE
            button17.id -> button17.visibility = View.INVISIBLE
            button18.id -> button18.visibility = View.INVISIBLE
            button19.id -> button19.visibility = View.INVISIBLE
            button20.id -> button20.visibility = View.INVISIBLE
            button21.id -> button21.visibility = View.INVISIBLE
            button22.id -> button22.visibility = View.INVISIBLE
            button23.id -> button23.visibility = View.INVISIBLE
            button24.id -> button24.visibility = View.INVISIBLE
        }
    }
}
