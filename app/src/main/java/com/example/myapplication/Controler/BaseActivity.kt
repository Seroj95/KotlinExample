package com.example.myapplication.Controler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}
