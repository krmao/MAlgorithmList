package com.smart.algorithm

/**
 * reverse string
 */
@Suppress("MemberVisibilityCanBePrivate", "unused")
object StringReverse {

    fun reverseStringByKotlin(str: String): String {
        return str.reversed()
    }

    fun reverseStringByForEach(str: String): String {
        var result = ""
        str.toCharArray().forEach { result = it + result }
        return result
    }

}