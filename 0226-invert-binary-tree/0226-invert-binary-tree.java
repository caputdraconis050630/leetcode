/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        return res(root, root.right, root.left);
    }
    public TreeNode res(TreeNode root, TreeNode right, TreeNode left){
        if(right==null && left==null) return root;
        root.right = left;
        root.left = right;  
        if(right!=null)res(right, right.right, right.left);
        if(left!=null)res(left, left.right, left.left);
        return root;
    }
}