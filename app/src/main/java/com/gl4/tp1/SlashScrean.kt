package com.gl4.tp1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.provider.MediaStore
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

class SlashScrean : AppCompatActivity(), View.OnClickListener {
    lateinit var txtWelcome : TextView;
    lateinit var imgWelcome : ImageView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        val order = intent.getStringExtra("order");
        txtWelcome=findViewById(R.id.textView);
        txtWelcome.text= "Welcome $order";

        timer.start()
    }
    val timer = object: CountDownTimer(5000, 1000) {
        override fun onTick(millisUntilFinished: Long) {

        }

        override fun onFinish() {
            val MainMenu = Intent(this@SlashScrean,MainActivity::class.java);
            startActivity(MainMenu);
        }
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

}