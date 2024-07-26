package com.example.project_g04.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project_g04.databinding.ActivityWelcomeBackBinding
import com.example.project_g04.models.Course
import com.example.project_g04.utils.Constants
import com.example.project_g04.utils.SharedPreferencesManager
import com.example.project_g04.utils.SnackbarHelper
import com.google.gson.Gson

class WelcomeBack : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBackBinding
    private lateinit var sharedPreferencesManager: SharedPreferencesManager
     private lateinit var course: Course
    private lateinit var snackbarHelper: SnackbarHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBackBinding.inflate(layoutInflater)
        setContentView(binding.root)

        this.snackbarHelper = SnackbarHelper(this.binding.root)
        this.sharedPreferencesManager = SharedPreferencesManager(this, Constants.SHARED_PREF_NAME)

        // click handlers
        binding.btnContinue.setOnClickListener {
            goToLessonList()
        }

        binding.tvResetData.setOnClickListener {
            deleteAllDataAndReset()
        }
    }

    override fun onResume() {
        super.onResume()
        val courseProgress: Course? = getCourseProgressFromSharedPreferences()
        if (courseProgress != null) {
            this.course = courseProgress
            this.snackbarHelper.showSnackbar("Your progress has been loaded")
            showProgress(this.course)
        } else {
            finish()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun showProgress(course: Course) {
        binding.tvWelcomeMessage.text = "Welcome back, ${intent.getStringExtra(Constants.EXTRA_USER_NAME)}"
        binding.tvProgressMessage.text = "You've completed ${course.getProgressPercentage()}% of the course!"
        binding.tvLessonsCompleted.text = "Lessons completed: ${course.getCompletedLessons()}"
        binding.tvLessonsRemaining.text = "Lessons remaining: ${course.getRemainingLessonsCount()}"
    }

    private fun getCourseProgressFromSharedPreferences(): Course? {
        val courseJSON = this.sharedPreferencesManager.getString(Constants.COURSE_KEY, "")
        if (courseJSON.isNullOrEmpty()) {
            return null
        }
        val course = Gson().fromJson(courseJSON, Course::class.java)
        return course
    }

    private fun deleteAllDataAndReset() {
        this.sharedPreferencesManager.clear()
        this.goToMain()
        this.snackbarHelper.showSnackbar("All data has been deleted")
    }

    private fun goToMain() {
        val intent: Intent = Intent(this@WelcomeBack, MainActivity::class.java)
        startActivity(intent)
    }

    private fun goToLessonList() {
        val intent: Intent = Intent(this@WelcomeBack, LessonsList::class.java)
        startActivity(intent)
    }
}