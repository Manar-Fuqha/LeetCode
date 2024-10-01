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
    int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        diameterlength(root);
        return max;
        
}

public int diameterlength(TreeNode node){
    int left=0,right=0;
    if(node.left!=null){
        left=diameterlength(node.left);
    }
    if(node.right!=null){
        right=diameterlength(node.right);
    }
    max=Math.max(max , left+right);
    return Math.max( left,right)+1;
}}