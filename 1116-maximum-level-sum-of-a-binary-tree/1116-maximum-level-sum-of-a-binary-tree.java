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
    public int maxLevelSum(TreeNode root) {
        int level = 1;
        int result =1;
        int maxCount =Integer.MIN_VALUE;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while(queue.size()>0){
            int size= queue.size();
            int count =0;
            for(int i=0;i<size;i++){
                TreeNode curr = queue.remove();
                count+=curr.val;
                if(curr.left!=null)queue.add(curr.left);
                if(curr.right!=null)queue.add(curr.right);


            }
            if(count>maxCount){
                result = level;
                maxCount=count;
            }
            level++;
            
  

        } 

        return result;
    }
}