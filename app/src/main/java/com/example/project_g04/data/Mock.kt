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
                completed = true,
                urlVideo = "https://www.youtube.com/watch?v=W6NZfCO5SIk"
            ),
            Lesson(
                number = 2,
                name = "What is JavaScript?",
                description = "This lesson explains the basics of JavaScript and its uses.",
                length = "30 min",
                completed = true,
                urlVideo = "https://www.youtube.com/watch?v=W6NZfCO5SIk"
            ),
            Lesson(
                number = 3,
                name = "Variables and Conditionals",
                description = "In this lesson, you will learn about variables and conditionals in JavaScript.",
                length = "1 hr 20 min",
                completed = false,
                urlVideo = "https://www.youtube.com/watch?v=W6NZfCO5SIk"
            ),
            Lesson(
                number = 4,
                name = "Loops",
                description = "This lesson covers loops in JavaScript and how to use them.",
                length = "38 min",
                completed = false,
                urlVideo = "https://www.youtube.com/watch?v=W6NZfCO5SIk"
            ),
            Lesson(
                number = 5,
                name = "Functions and Scope",
                description = "This lesson explains functions in JavaScript and the concept of scope.",
                length = "45 min",
                completed = false,
                urlVideo = "https://www.youtube.com/watch?v=W6NZfCO5SIk"
            ),
            Lesson(
                number = 6,
                name = "Introduction to HTML",
                description = "This lesson introduces HTML and its basic structure.",
                length = "20 min",
                completed = true,
                urlVideo = "https://www.youtube.com/watch?v=W6NZfCO5SIk"
            ),
            Lesson(
                number = 7,
                name = "HTML Tags and Attributes",
                description = "This lesson covers various HTML tags and their attributes.",
                length = "25 min",
                completed = false,
                urlVideo = "https://www.youtube.com/watch?v=W6NZfCO5SIk"
            ),
            Lesson(
                number = 8,
                name = "CSS Basics",
                description = "This lesson introduces CSS and how to style HTML elements.",
                length = "35 min",
                completed = false,
                urlVideo = "https://www.youtube.com/watch?v=W6NZfCO5SIk"
            ),
            Lesson(
                number = 9,
                name = "Advanced CSS Techniques",
                description = "This lesson covers advanced techniques in CSS for creating responsive layouts.",
                length = "50 min",
                completed = false,
                urlVideo = "https://www.youtube.com/watch?v=W6NZfCO5SIk"
            ),
            Lesson(
                number = 10,
                name = "JavaScript DOM Manipulation",
                description = "In this lesson, you will learn how to manipulate the DOM using JavaScript.",
                length = "40 min",
                completed = false,
                urlVideo = "https://www.youtube.com/watch?v=W6NZfCO5SIk"
            ),
            Lesson(
                number = 11,
                name = "Event Handling in JavaScript",
                description = "This lesson explains how to handle events in JavaScript.",
                length = "30 min",
                completed = false,
                urlVideo = "https://www.youtube.com/watch?v=W6NZfCO5SIk"
            ),
            Lesson(
                number = 12,
                name = "AJAX and Fetch API",
                description = "This lesson covers AJAX and the Fetch API for asynchronous operations in JavaScript.",
                length = "1 hr",
                completed = false,
                urlVideo = "https://www.youtube.com/watch?v=W6NZfCO5SIk"
            ),
        )
    )
}