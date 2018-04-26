package com.smart.algorithm.core


@Suppress("unused")
object Vocabulary {
    fun charAt(index: Int): Char {
        return (index + 65).toChar()
    }

    fun indexFrom(_char: Char): Int {
        return _char.toInt() - 65
    }
}