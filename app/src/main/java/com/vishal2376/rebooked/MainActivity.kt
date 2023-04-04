package com.vishal2376.rebooked

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.vishal2376.rebooked.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //only light mode
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);


    }
}