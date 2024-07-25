package com.example.project_g04.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project_g04.databinding.ActivityLessonsListBinding

class LessonsList : AppCompatActivity() {
    private lateinit var binding: ActivityLessonsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonsListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}