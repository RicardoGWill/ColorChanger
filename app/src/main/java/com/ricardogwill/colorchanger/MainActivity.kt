package com.ricardogwill.colorchanger

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener, View.OnLongClickListener {

    var colorString: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        redB.setOnClickListener(this)
        orangeB.setOnClickListener(this)
        yellowB.setOnClickListener(this)
        greenB.setOnClickListener(this)
        cyanB.setOnClickListener(this)
        blueB.setOnClickListener(this)
        violetB.setOnClickListener(this)
        whiteB.setOnClickListener(this)
        blackB.setOnClickListener(this)
        backgroundB.setOnClickListener(this)

        redB.setOnLongClickListener(this)
        orangeB.setOnLongClickListener(this)
        yellowB.setOnLongClickListener(this)
        greenB.setOnLongClickListener(this)
        cyanB.setOnLongClickListener(this)
        blueB.setOnLongClickListener(this)
        violetB.setOnLongClickListener(this)
        whiteB.setOnLongClickListener(this)
        blackB.setOnLongClickListener(this)
        backgroundB.setOnLongClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.redB -> {
                colorString = "r"
                backgroundB.setBackgroundResource(R.color.red)
            }
            R.id.orangeB -> {
                colorString = "o"
                backgroundB.setBackgroundResource(R.color.orange)
            }
            R.id.yellowB -> {
                colorString = "y"
                backgroundB.setBackgroundResource(R.color.yellow)
            }
            R.id.greenB -> {
                colorString = "g"
                backgroundB.setBackgroundResource(R.color.green)
            }
            R.id.cyanB -> {
                colorString = "c"
                backgroundB.setBackgroundResource(R.color.cyan)
            }
            R.id.blueB -> {
                colorString = "b"
                backgroundB.setBackgroundResource(R.color.blue)
            }
            R.id.violetB -> {
                colorString = "v"
                backgroundB.setBackgroundResource(R.color.violet)
            }
            R.id.whiteB -> {
                colorString = "wh"
                backgroundB.setBackgroundResource(R.color.white)
            }
            R.id.blackB -> {
                colorString = "bl"
                backgroundB.setBackgroundResource(R.color.black)
            }
            R.id.backgroundB -> {
                colorString = ""
                backgroundB.setBackgroundResource(R.color.defaultBG)
            }
        }

    }

    override fun onLongClick(v: View?): Boolean {
        when (v?.id) {
            R.id.whiteB -> {
                makeLighter()
            }
            R.id.blackB -> {
                makeDarker()
            }
            R.id.backgroundB -> {
                backgroundB.setBackgroundResource(R.color.defaultBG)
            }
        }
        return true
    }

    fun makeLighter() {
        when (colorString) {
            "r" -> {
                backgroundB.setBackgroundResource(R.color.lightRed)
            }
            "o" -> {
                backgroundB.setBackgroundResource(R.color.lightOrange)
            }
            "y" -> {
                backgroundB.setBackgroundResource(R.color.lightYellow)
            }
            "g" -> {
                backgroundB.setBackgroundResource(R.color.lightGreen)
            }
            "c" -> {
                backgroundB.setBackgroundResource(R.color.lightCyan)
            }
            "b" -> {
                backgroundB.setBackgroundResource(R.color.lightBlue)
            }
            "v" -> {
                backgroundB.setBackgroundResource(R.color.lightViolet)
            }
            "wh" -> {
                backgroundB.setBackgroundResource(R.color.white)
            }
            "bl" -> {
                backgroundB.setBackgroundResource(R.color.grey)
            }
            else -> {
                // Do nothing.
            }
        }
    }

    fun makeDarker() {
        when (colorString) {
            "r" -> {
                backgroundB.setBackgroundResource(R.color.darkRed)
            }
            "o" -> {
                backgroundB.setBackgroundResource(R.color.darkOrange)
            }
            "y" -> {
                backgroundB.setBackgroundResource(R.color.darkYellow)
            }
            "g" -> {
                backgroundB.setBackgroundResource(R.color.darkGreen)
            }
            "c" -> {
                backgroundB.setBackgroundResource(R.color.darkCyan)
            }
            "b" -> {
                backgroundB.setBackgroundResource(R.color.darkBlue)
            }
            "v" -> {
                backgroundB.setBackgroundResource(R.color.darkViolet)
            }
            "wh" -> {
                backgroundB.setBackgroundResource(R.color.grey)
            }
            "bl" -> {
                backgroundB.setBackgroundResource(R.color.black)
            }
            else -> {
                // Do nothing.
            }
        }
    }



}
