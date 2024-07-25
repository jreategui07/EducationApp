package com.example.project_g04

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project_g04.databinding.ActivityWelcomeBackBinding

class WelcomeBack : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBackBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}