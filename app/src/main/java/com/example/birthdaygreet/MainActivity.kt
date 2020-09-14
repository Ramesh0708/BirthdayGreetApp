package com.example.birthdaygreet

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.birthdaygreet.MusicService.ServiceBinder
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)









    }












    fun buttoncard(view: View) {
        val name = editTextTextPersonName.editableText.toString()

        val intent = Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra("name", name)

        startActivity(intent)

    }
}