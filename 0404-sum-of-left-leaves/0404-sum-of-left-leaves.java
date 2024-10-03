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
   
    public int sumOfLeftLeaves(TreeNode root) {
        if(root.left==null&&root.right==null)return 0;
        return SumLeft(root);
    }

    public int SumLeft(TreeNode node){
        if(node==null)return 0;
        int sum=0;
        if(node.left!=null&&node.left.left==null&&node.left.right==null) 
        sum+= node.left.val;

        sum+=SumLeft(node.left);
        sum+=SumLeft(node.right);
  
        return sum;
    }
}