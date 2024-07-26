package com.example.project_g04.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.project_g04.adapters.LessonAdapter
import com.example.project_g04.databinding.ActivityLessonsListBinding
import com.example.project_g04.interfaces.ClickDetectorInterface
import com.example.project_g04.models.Course
import com.example.project_g04.utils.Constants
import com.example.project_g04.utils.SharedPreferencesManager
import com.example.project_g04.utils.SnackbarHelper
import com.google.gson.Gson

class LessonsList : AppCompatActivity(), ClickDetectorInterface {
    private lateinit var binding: ActivityLessonsListBinding
    private lateinit var adapter: LessonAdapter
    private lateinit var course: Course
    private lateinit var sharedPreferencesManager: SharedPreferencesManager
    private lateinit var snackbarHelper: SnackbarHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonsListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.snackbarHelper = SnackbarHelper(this.binding.root)
        this.sharedPreferencesManager = SharedPreferencesManager(this, Constants.SHARED_PREF_NAME)
    }

    override fun onResume() {
        super.onResume()
         val loadedCourse: Course? = getCourseProgressFromSharedPreferences()
        if (loadedCourse !== null) {
            this.course = loadedCourse
            loadAdapter()
        } else {
            finish()
        }
    }

    private fun getCourseProgressFromSharedPreferences(): Course? {
        val courseJSON = this.sharedPreferencesManager.getString(Constants.COURSE_KEY, "")
        if (courseJSON.isNullOrEmpty()) {
            return null
        }
        val course = Gson().fromJson(courseJSON, Course::class.java)
        return course
    }

    private fun loadAdapter() {
        // create an instance of the custom adapter
        this.adapter = LessonAdapter(this, this.course.lessons.toMutableList(), this)
        this.binding.rvContainer.adapter = this.adapter

        // setting title
        this.binding.tvCourseTitle.text = this.course.title

        // configuring the RecyclerView with a LinearLayoutManager
        this.binding.rvContainer.layoutManager = LinearLayoutManager(this)

        // adding a line between each item in the list of the
        this.binding.rvContainer.addItemDecoration(
            DividerItemDecoration(
                this,
                LinearLayoutManager.VERTICAL
            )
        )
    }

    override fun onRowClicked(position: Int) {
        val intent: Intent = Intent(this@LessonsList, LessonDetails::class.java)
        intent.putExtra("EXTRA_LESSON", this.course.lessons[position])
        startActivity(intent)
    }
}