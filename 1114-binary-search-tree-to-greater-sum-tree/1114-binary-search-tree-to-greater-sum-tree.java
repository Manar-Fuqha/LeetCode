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
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        sumBST(root);
        

        return root;
    }
    private void sumBST(TreeNode node ){
        if(node==null)return ;
        sumBST(node.right );
        sum+=node.val;
        node.val=sum;
       sumBST(node.left);
        
    }
}