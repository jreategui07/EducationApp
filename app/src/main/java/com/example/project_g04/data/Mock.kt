package com.example.project_g04.data

import com.example.project_g04.models.Course
import com.example.project_g04.models.Lesson

object Mock {
    var COURSE = Course(
        title = "Learning Web: HTML, CSS and Javascript",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Introduction to the Course",
                description = "This lesson introduces the course and what you will learn.",
                length = "12 min",
                completed = true
            ),
            Lesson(
                id = 2,
                title = "What is JavaScript?",
                description = "This lesson explains the basics of JavaScript and its uses.",
                length = "30 min",
                completed = true
            ),
            Lesson(
                id = 3,
                title = "Variables and Conditionals",
                description = "In this lesson, you will learn about variables and conditionals in JavaScript.",
                length = "1 hr 20 min",
                completed = false
            ),
            Lesson(
                id = 4,
                title = "Loops",
                description = "This lesson covers loops in JavaScript and how to use them.",
                length = "38 min",
                completed = false
            )
        )
    )
}