package com.smart.algorithm.core

@Suppress("MemberVisibilityCanBePrivate", "unused")
object MatrixUtil {
    const val INF = -1//无穷大/不可达

    fun printMatrix(originalMatrix: Array<IntArray>?) {
        if (originalMatrix != null) {
            println("━━━━━━━━━━━━━━━━━━━━━━━━━━━")
            System.out.printf("%3c%3c", ' ', '┃')
            for (i in originalMatrix.indices)
                System.out.printf("%6c", Vocabulary.charAt(i))
            println()
            println("━━━━━━━━━━━━━━━━━━━━━━━━━━━")
            for (i in originalMatrix.indices) {
                val itemMatrix = originalMatrix[i]
                System.out.printf("%3c%3c", Vocabulary.charAt(i), '┃')
                for (itemValue in itemMatrix)
                    if (itemValue == INF)
                        System.out.printf("%6s", "INF")
                    else
                        System.out.printf("%6d", itemValue)
                println()
            }
            println("━━━━━━━━━━━━━━━━━━━━━━━━━━━")
        }
    }
}