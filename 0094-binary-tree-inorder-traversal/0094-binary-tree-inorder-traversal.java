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
    List<Integer> sol;
    
    public List<Integer> inorderTraversal(TreeNode root) {
        sol = new ArrayList<Integer>();
        inorder(root);
        return sol;
    }
    
    public void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        sol.add(node.val);
        inorder(node.right);
    }
}