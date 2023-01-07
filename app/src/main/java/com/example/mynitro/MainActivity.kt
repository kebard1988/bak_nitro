package com.example.mynitro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mynitro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bidingMy:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bidingMy = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bidingMy.root)

    }
}