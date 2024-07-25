package com.example.project_g04.models

import java.io.Serializable

class Lesson(
    val number: Int,
    val name: String,
    val description: String,
    val length: String,
    var completed: Boolean = false,
    val urlVideo: String,
): Serializable
