package io.github.algorithms

class Solution {
    fun numJewelsInStones(J: String, S: String): Int {
        var numJewels = 0
        for (i in 0 until S.length) {
            val element = S[i].toString()
            if (J.contains(element)) {
                numJewels++
            }
        }

        return numJewels
    }
}