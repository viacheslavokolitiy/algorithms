package io.github.algorithms

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
class Solution5 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)

        for (i in 0 until nums.size) {
            var tempIndex = i

            while (tempIndex < nums.size) {
                val element = nums[i]
                var nextElement: Int
                val nextIndex = tempIndex + 1
                if (nextIndex < nums.size) {
                    nextElement = nums[nextIndex]
                    if (element + nextElement == target) {
                        result[0] = i
                        result[1] = nextIndex
                        return result
                    }
                }

                tempIndex++
            }
        }

        return result
    }
}