package com.example.project_g04.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project_g04.data.Mock
import com.example.project_g04.databinding.ActivityMainBinding
import com.example.project_g04.utils.Constants
import com.example.project_g04.utils.SharedPreferencesManager
import com.example.project_g04.utils.SnackbarHelper
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPreferencesManager: SharedPreferencesManager
    private lateinit var snackbarHelper: SnackbarHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.snackbarHelper = SnackbarHelper(this.binding.root)
        this.sharedPreferencesManager = SharedPreferencesManager(this, Constants.SHARED_PREF_NAME)

        val userName = this.sharedPreferencesManager.getString(Constants.USER_KEY, "")
        if (userName != "") {
            this.goToWelcomeBack(userName)
        }

        // click handlers
        binding.btnContinue.setOnClickListener {
            registerUser()
        }
    }

    private fun registerUser() {
        val userName = binding.etName.text.toString()
        if (userName == "") {
            this.snackbarHelper.showSnackbar("Please enter your name")
            return
        }
        this.sharedPreferencesManager.putString(Constants.USER_KEY, userName)
        // create course
        initCourse()
        // navigate to lesson list
        goToLessonList()
    }

    private fun initCourse() {
        val gson = Gson()
        val courseJSON = gson.toJson(Mock.COURSE)
        this.sharedPreferencesManager.putString(Constants.COURSE_KEY, courseJSON)
    }

    private fun goToWelcomeBack(userName: String) {
        val intent: Intent = Intent(this@MainActivity, WelcomeBack::class.java)
        intent.putExtra(Constants.EXTRA_USER_NAME, userName)
        startActivity(intent)
    }

    private fun goToLessonList() {
        val intent: Intent = Intent(this@MainActivity, LessonsList::class.java)
        startActivity(intent)
    }
}