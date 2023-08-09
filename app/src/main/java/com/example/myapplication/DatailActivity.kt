package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityDatailBinding

class DatailActivity : AppCompatActivity() {
    private lateinit var binging: ActivityDatailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binging = ActivityDatailBinding.inflate(layoutInflater)


        setContentView(binging.root)
        setSupportActionBar(binging.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}