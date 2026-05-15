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
 
    public void rec(TreeNode root,List<Integer> res){
        // Root Left Right
        if(root == null){
            return ;
        }
        res.add(root.val);
        rec(root.left,res);
        rec(root.right,res);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        rec(root,res);
        return res;
    }
}