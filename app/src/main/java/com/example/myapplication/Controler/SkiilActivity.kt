package com.example.myapplication.Controler

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast

import com.example.myapplication.R
import com.example.myapplication.Utilitis.EXTRA_PLAYER
import com.example.myapplication.model.Player
import kotlinx.android.synthetic.main.activity_skiil.*

class SkiilActivity : BaseActivity() {
lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skiil)
     player= intent.getParcelableExtra(EXTRA_PLAYER)

    }

    fun onBallerClick(view: View) {
beginnerSkinBtn.isChecked=false
        player.sklin="baler"
    }
    fun onBeginerClick(view: View) {
ballerSkinBtn.isChecked=false
        player.sklin="beginer"
    }

    fun onSkilFinishClciked(view: View) {
        if (player.sklin !=""){
            val sklinActivity=Intent(this,FinishActivity::class.java)
           sklinActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(sklinActivity)

        }else{
            Toast.makeText(this,"Please Select",Toast.LENGTH_LONG).show()
        }

    }
}
