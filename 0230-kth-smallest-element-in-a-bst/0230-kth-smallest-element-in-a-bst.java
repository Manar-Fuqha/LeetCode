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
    int count=0;
    TreeNode output = null;
    public int kthSmallest(TreeNode root, int k) {
        if(root.left==null && root.right==null)return root.val; 
         findSmallest(root , k);
         return output.val;
    }
    public void findSmallest(TreeNode node , int k){
        if(node==null)return ;
        
       findSmallest(node.left , k);
       count++;
       if(count==k){
        output=node;
        return ;
       }
       findSmallest(node.right ,k);
        
    }
}