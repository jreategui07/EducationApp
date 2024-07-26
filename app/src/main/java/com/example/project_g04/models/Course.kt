package com.example.project_g04.models

class Course(
    val title: String,
    val lessons: List<Lesson>
) {
    fun getProgressPercentage(): Int {
        val totalLessons = lessons.size
        if (totalLessons <= 0) {
            return 0
        }
        val completedLessons = getCompletedLessons()
        val progress = (completedLessons.toDouble() / totalLessons.toDouble()) * 100
        return progress.toInt()
    }

    fun getCompletedLessons(): Int {
        var count = 0
        for (lesson in lessons) {
            if (lesson.completed) {
                count++
            }
        }
        return count
    }

    fun getRemainingLessonsCount(): Int {
        var count = 0
        for (lesson in lessons) {
            if (!lesson.completed) {
                count++
            }
        }
        return count
    }

    fun completedLesson(lessonNumber: Int) {
        for (lesson in lessons) {
            if (lesson.number == lessonNumber) {
                lesson.completed = true
                break
            }
        }
    }
}
