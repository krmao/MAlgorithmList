package com.smart.algorithm

import org.junit.Test

class StringReverseTest {

    @Test
    fun testReverseStringByKotlin() {
        val str = "hello world"
        println("reverseStringByKotlin:before reverse: $str")
        println("reverseStringByKotlin:after  reverse: ${StringReverse.reverseStringByKotlin(str)}")
    }

    @Test
    fun testReverseStringByForEach() {
        val str = "hello world"
        println("reverseStringByForEach:before reverse: $str")
        println("reverseStringByForEach:after  reverse: ${StringReverse.reverseStringByForEach(str)}")
    }

}