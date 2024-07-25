package com.example.project_g04.data

import com.example.project_g04.models.Course
import com.example.project_g04.models.Lesson

object Mock {
    var COURSE = Course(
        title = "Learning Web: HTML, CSS and Javascript",
        lessons = listOf(
            Lesson(
                number = 1,
                name = "Introduction to the Course",
                description = "This lesson introduces the course and what you will learn.",
                length = "12 min",
                completed = true
            ),
            Lesson(
                number = 2,
                name = "What is JavaScript?",
                description = "This lesson explains the basics of JavaScript and its uses.",
                length = "30 min",
                completed = true
            ),
            Lesson(
                number = 3,
                name = "Variables and Conditionals",
                description = "In this lesson, you will learn about variables and conditionals in JavaScript.",
                length = "1 hr 20 min",
                completed = false
            ),
            Lesson(
                number = 4,
                name = "Loops",
                description = "This lesson covers loops in JavaScript and how to use them.",
                length = "38 min",
                completed = false
            )
        )
    )
}