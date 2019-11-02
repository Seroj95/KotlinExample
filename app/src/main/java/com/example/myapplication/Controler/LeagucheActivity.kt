package com.example.myapplication.Controler

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast

import com.example.myapplication.R
import com.example.myapplication.Utilitis.EXTRA_PLAYER
import com.example.myapplication.model.Player
import kotlinx.android.synthetic.main.activity_leaguche.*

class LeagucheActivity : BaseActivity() {


    var player=Player("","")
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaguche)
    }

    fun onMensClick(view: View) {
        womenLeaguBtn.isChecked=false
        condedLeguaBtn.isChecked=false
        player.league="mens"
    }
    fun onWomensClick(view: View) {
        mensLeaguyBtn.isChecked=false
        womenLeaguBtn.isChecked=false
       player.league="womens"
    }
    fun onCoClick(view: View) {
        mensLeaguyBtn.isChecked=false
        womenLeaguBtn.isChecked=false
       player.league="co-ed"
    }


    fun leguaNextClick(view: View) {
        if (player.league !=""){
            val skiilActivity=Intent(this, SkiilActivity::class.java)
           skiilActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skiilActivity)
        }else{
            Toast.makeText(this,"Please Select Button",Toast.LENGTH_LONG).show()
        }


    }

}
