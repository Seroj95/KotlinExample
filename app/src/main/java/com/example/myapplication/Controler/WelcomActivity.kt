package com.example.myapplication.Controler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.R

class WelcomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClickStart(view: View) {

        val intent=Intent(this, LeagucheActivity::class.java)
        startActivity(intent)


    }
}
