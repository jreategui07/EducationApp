package com.example.project_g04.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project_g04.databinding.ActivityLessonDetailsBinding
import com.example.project_g04.models.Lesson
import com.example.project_g04.utils.SnackbarHelper

class LessonDetails : AppCompatActivity() {
    private lateinit var binding: ActivityLessonDetailsBinding
    private lateinit var snackbarHelper: SnackbarHelper
    private lateinit var lesson: Lesson

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // init custom snackbar helper
        this.snackbarHelper = SnackbarHelper(this.binding.root)

        if (intent != null) {
            this.lesson = intent.getSerializableExtra("EXTRA_LESSON") as Lesson
            showLesson()
        }

        binding.btnWatchLesson.setOnClickListener {
            watchLesson()
        }

        binding.btnMarkLessonCompleted.setOnClickListener {
            markLessonCompleted()
        }
    }

    private fun showLesson() {
        binding.tvLessonTitle.setText("${this.lesson.number}. ${this.lesson.name}")
        binding.tvLessonLength.setText("Length: ${this.lesson.length}")
        binding.tvLessonDescription.setText(this.lesson.description)
    }

    private fun watchLesson() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(this.lesson.urlVideo))
        startActivity(intent)
    }

    private fun markLessonCompleted() {
        this.lesson.completed = true
        this.snackbarHelper.showSnackbar("Lesson successfully updated")
        // TODO: check, updating class lesson in storage
    }
}