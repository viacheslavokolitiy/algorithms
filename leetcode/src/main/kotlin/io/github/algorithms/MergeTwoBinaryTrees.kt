package io.github.algorithms

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