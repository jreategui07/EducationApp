package com.example.project_g04.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project_g04.databinding.ActivityLessonDetailsBinding
import com.example.project_g04.models.Course
import com.example.project_g04.models.Lesson
import com.example.project_g04.utils.Constants
import com.example.project_g04.utils.SharedPreferencesManager
import com.example.project_g04.utils.SnackbarHelper
import com.google.gson.Gson

class LessonDetails : AppCompatActivity() {
    private lateinit var binding: ActivityLessonDetailsBinding
    private lateinit var sharedPreferencesManager: SharedPreferencesManager
    private lateinit var snackbarHelper: SnackbarHelper
    private lateinit var lesson: Lesson

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // init custom snackbar helper
        this.snackbarHelper = SnackbarHelper(this.binding.root)
        this.sharedPreferencesManager = SharedPreferencesManager(this, Constants.SHARED_PREF_NAME)

        if (intent != null) {
            this.lesson = intent.getSerializableExtra(Constants.EXTRA_LESSON) as Lesson
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
        var courseProgress: Course? = getCourseProgressFromSharedPreferences()
        if (courseProgress != null) {
            courseProgress.completedLesson(this.lesson.number)
            updateCourseInStorage(courseProgress)
            this.snackbarHelper.showSnackbar("Lesson successfully updated")
        } else {
            finish()
        }
    }

    private fun updateCourseInStorage(course: Course) {
        val gson = Gson()
        val courseJSON = gson.toJson(course)
        this.sharedPreferencesManager.putString(Constants.COURSE_KEY, courseJSON)
    }

    private fun getCourseProgressFromSharedPreferences(): Course? {
        val courseJSON = this.sharedPreferencesManager.getString(Constants.COURSE_KEY, "")
        if (courseJSON.isNullOrEmpty()) {
            return null
        }
        val course = Gson().fromJson(courseJSON, Course::class.java)
        return course
    }
}