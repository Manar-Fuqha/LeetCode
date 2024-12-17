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
        if (root ==null)return null;
        TreeNode newRoot = new TreeNode(root.val);
        invert(newRoot , root);
        return newRoot;
    }
    private void invert(TreeNode node , TreeNode root){
        if(node==null)return;
        if(root.left!=null) node.right = new TreeNode(root.left.val);
        if(root.right!=null) node.left =  new TreeNode(root.right.val);
        invert(node.left  , root.right);
        invert(node.right , root.left);
    }
}