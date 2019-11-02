package com.example.myapplication.Controler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R

import com.example.myapplication.Utilitis.EXTRA_PLAYER
import com.example.myapplication.model.Player
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
       val player=intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeaguText.text="Looking for ${player.league}  ${player.sklin}"
    }
}
