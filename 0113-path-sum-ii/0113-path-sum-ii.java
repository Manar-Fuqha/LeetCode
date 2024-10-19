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
    List<List<Integer>> list = new LinkedList<>();
    List<Integer> l = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum ) {
        hasPathSum(root , targetSum); 
     
        return list;

    }
    private void hasPathSum(TreeNode root , int sum){
        if(root == null)return;

        l.add(root.val);
       
        if(sum==root.val&&root.left==null && root.right==null)
        {
           list.add(new LinkedList<>(l));
            
        }
        
       hasPathSum(root.left , sum-root.val);
       hasPathSum(root.right , sum-root.val );
       l.removeLast();
    }
}