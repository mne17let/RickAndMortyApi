package com.example.rickandmortyapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rickandmortyapi.View.ListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setStartFragment()

    }


    private fun setStartFragment(){
        supportFragmentManager.beginTransaction().replace(R.id.id_frame_container,ListFragment())
    }
}