package com.example.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1){
            showTimePickerDialog()

        }


    }

    private fun showTimePickerDialog() {


        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")
                if (hour >= 2 && hour <= 9) {
                    Log.d("UI_PARTS", "おはよう")
                    aisatsu.text = "おはよう"
                } else if (hour >= 10 && hour <= 17) {
                    Log.d("UI_PARTS", "こんにちは")
                    aisatsu.text = "こんにちは"
                } else {
                    Log.d("UI_PARTS", "こんばんは")
                    aisatsu.text = "こんばんは"
                }
            },
            0, 0, true
        )
        timePickerDialog.show()

    }




    }



