package com.example.project_g04.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.project_g04.R
import com.example.project_g04.databinding.LessonRowLayoutBinding
import com.example.project_g04.models.Course
import com.example.project_g04.models.Lesson

class LessonAdapter(
    private val context: Context,
    private val course: Course,
): RecyclerView.Adapter<LessonAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: LessonRowLayoutBinding) : RecyclerView.ViewHolder (binding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = LessonRowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return course.lessons.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val lesson: Lesson = course.lessons[position]

        // TODO: check image with number of lesson
        holder.binding.tvLessonTitle.text = lesson.name
        holder.binding.tvLessonLength.text = lesson.length
        if (lesson.completed) {
            Glide.with(context)
                .load(R.drawable.ic_check_circle)
                .into(holder.binding.ivLessonCompleted)
        } else {
            holder.binding.ivLessonCompleted.setImageDrawable(null)
        }
    }
}