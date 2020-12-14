package com.example.basics

fun toLower(word: String): String = word.toLowerCase()
fun show(vararg words : String) {
    words.forEach { println("Word is : $it") }
}
