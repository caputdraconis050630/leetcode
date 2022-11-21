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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> sol = new ArrayList<Integer>();
        if (root == null) return sol;
        Stack<TreeNode> bag = new Stack<TreeNode>();
        
        bag.push(root);
        while (!bag.isEmpty()) {
            TreeNode cur = bag.pop();
            sol.add(cur.val);
            
            if(cur.right != null) bag.push(cur.right);
            if(cur.left != null) bag.push(cur.left);
        }
        return sol;
    }
}