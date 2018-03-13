package io.github.algorithms

import java.util.*

/**
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ...,
 * (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 *
 * n is a positive integer, which is in the range of [1, 10000].
 * All the integers in the array will be in the range of [-10000, 10000].
 */
class Solution3 {
    fun arrayPairSum(nums: IntArray): Int {
        Arrays.sort(nums)
        var count = 0
        var i = 0
        while (i < nums.size) {
            count += nums[i]
            i += 2
        }

        return count
    }
}