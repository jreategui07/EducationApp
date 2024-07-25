package com.example.project_g04.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.project_g04.adapters.LessonAdapter
import com.example.project_g04.data.Mock
import com.example.project_g04.databinding.ActivityLessonsListBinding
import com.example.project_g04.interfaces.ClickDetectorInterface
import com.example.project_g04.models.Course
import com.example.project_g04.models.Lesson

class LessonsList : AppCompatActivity(), ClickDetectorInterface {
    private lateinit var binding: ActivityLessonsListBinding
    private lateinit var adapter: LessonAdapter
    private lateinit var course: Course

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonsListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // getting mock data
        this.course = Mock.COURSE

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
        startActivity(intent)
    }
}