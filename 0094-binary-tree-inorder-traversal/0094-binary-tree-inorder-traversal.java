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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> sol = new ArrayList<Integer>();
        Stack<TreeNode> bag = new Stack<TreeNode>();
        TreeNode cur = root;
        
        while (cur != null || !bag.isEmpty()) {
            while (cur != null) {
                bag.push(cur);
                cur = cur.left;
            }
            cur = bag.pop();
            sol.add(cur.val);
            cur = cur.right;
        }
        return sol;
    }
    
//     List<Integer> sol;
    
//     public List<Integer> inorderTraversal(TreeNode root) {
//         sol = new ArrayList<Integer>();
//         inorder(root);
//         return sol;
//     }
    
//     public void inorder(TreeNode node) {
//         if (node == null) return;
//         inorder(node.left);
//         sol.add(node.val);
//         inorder(node.right);
//     }
}