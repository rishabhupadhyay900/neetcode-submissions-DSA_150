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
   int count =0;
   int max =0;
   private void good(TreeNode root,int max){

        if(root == null){
           return ;
        }
        if(root.val >= max){
            count++;
        }
       
        good(root.left , Math.max(root.val,max));
       
       
        good(root.right , Math.max(root.val,max));

    

    }
    public int goodNodes(TreeNode root) {

        good(root,root.val);
        if(root == null){
            return 0;
        }
        return count;
    }
}
