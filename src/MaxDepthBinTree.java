/*
104. Maximum Depth of Binary Tree
https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */


public class MaxDepthBinTree {

    //returns the max depth of a binary tree
    public int maxDepth(TreeNode root) {
        int totalMax;
        int currentMax;

        //check if the root is null
        if (root == null) {
            return 0;
        }
        //check if the root has no children
        if (root.left == null && root.right == null) {
            return 1;
        }
        //check if the root has a left child
        if (root.left != null) {
            currentMax = maxDepth(root.left);
        } else {
            currentMax = 0;
        }
        //check if the root has a right child
        if (root.right != null) {
            totalMax = maxDepth(root.right);
        } else {
            totalMax = 0;
        }
        //check if the currentMax is greater than the totalMax
        if (currentMax > totalMax) {
            totalMax = currentMax;
        }
        //return the totalMax + 1
        return totalMax + 1;
    }
}
