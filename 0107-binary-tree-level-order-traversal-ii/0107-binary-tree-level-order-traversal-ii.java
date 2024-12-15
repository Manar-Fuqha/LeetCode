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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
   
        List<List<Integer>> list= new ArrayList<>();
        if(root==null)return list;
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> l;

        queue.add(root);
        while(queue.size()>0){
            int size = queue.size();
            l = new ArrayList();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.remove();
                l.add(curr.val);
                if(curr.left!=null)queue.add(curr.left);
                if(curr.right!=null)queue.add(curr.right);

            }
            list.addFirst(l);
        }
        return list;
    }
}