/* LeetCode problem #100 Same Tree
* https://leetcode.com/problems/same-tree/
*/

public class sameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        //first check if both are null
        if (p == null && q == null) {
            return true;
        }

        //check if one is null and the other is not
        if (p == null || q == null) {
            return false;
        }
        //check if the values are the same
        if (p.val != q.val) {
            return false;
        }
        //check if the left and right subtrees are the same
        if (!isSameTree(p.left, q.left)) {
            return false;
        }
        if (!isSameTree(p.right, q.right)) {
            return false;
        }
        return true;
    }


}
