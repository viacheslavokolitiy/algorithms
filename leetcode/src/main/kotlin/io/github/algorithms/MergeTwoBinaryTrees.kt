package io.github.algorithms

/**
 * Given two binary trees and imagine that when you put one of them to cover the other,
 * some nodes of the two trees are overlapped while the others are not.
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap,
 * then sum node values up as the new value of the merged node. Otherwise, the NOT null node will
 * be used as the node of new tree
 *
 */
class Solution2 {
    fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        if (t1 == null && t2 == null) return null
        val value = (t1?.`val` ?: 0) + (t2?.`val` ?: 0)
        val newNode = TreeNode(value)
        newNode.left = mergeTrees(t1?.left, t2?.left)
        newNode.right = mergeTrees(t1?.right, t2?.right)

        return newNode
    }

    class TreeNode(var `val`: Int = 0) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}