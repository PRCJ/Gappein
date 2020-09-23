package com.example.gappeinclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.gappein.sdk.Gappein
import com.gappein.sdk.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Gappein.initialize()

    }
  }