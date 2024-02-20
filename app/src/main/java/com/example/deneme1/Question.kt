package com.example.deneme1

data class Question(
    val question: String,
    val options: List<String>,
    val correctOption: Int
) {
    operator fun compareTo(i: Int): Int {
        TODO("Not yet implemented")
    }
}