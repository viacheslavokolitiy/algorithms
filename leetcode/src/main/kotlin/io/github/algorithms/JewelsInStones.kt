package io.github.algorithms

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive,
 * so "a" is considered a different type of stone from "A".
 *
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 */
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