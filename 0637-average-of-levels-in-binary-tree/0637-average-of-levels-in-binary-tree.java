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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size()>0){
            int size = queue.size();
            double avg =0;
            for(int i=0;i<size;i++){
                TreeNode curr = queue.remove();
                avg += curr.val;
                if(curr.left!=null)queue.add(curr.left);
                if(curr.right!=null)queue.add(curr.right);

            }
            list.add(avg/size);
        }
        return list;
    }
}