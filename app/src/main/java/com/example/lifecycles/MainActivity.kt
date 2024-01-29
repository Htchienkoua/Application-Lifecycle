package com.example.lifecycles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView : TextView
    lateinit var button1 : Button
    lateinit var button2: Button

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button1 = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)

        button1.setOnClickListener {
                counter = + counter
            textView.text = "" + counter
        }

        button2.setOnClickListener {

            var intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)

        }

        //the log record is used to track the lifecycle stage of the app
        //we use the Log method to use tha logs
        Log.d("Message","First Activity onCreate")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message","First Activity onDestroy")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Message","First Activity onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Message","First Activity onStop")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Message","First Activity onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("Message","First Activity onResume")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message","First Activity onRestart")

    }
//take note that whenever the device rotates, the logs show the activity restarts before rendering on the
    //new orientation, so make sure to always save data in between activites, when the activity is onPause()
    //or when you move to another activity , else the info gets lost
}