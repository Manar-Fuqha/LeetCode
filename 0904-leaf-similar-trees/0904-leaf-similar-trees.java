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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList();
        List<Integer> l2 = new ArrayList();
        findLeaf(root1 ,  l1 );
        findLeaf(root2 ,  l2 );
        return l1.equals(l2);
    }
    private void findLeaf(TreeNode node , List<Integer> l){
        if(node==null)return ;
        if(node.left==null && node.right==null) l.add(node.val);
        findLeaf(node.left ,l);
        findLeaf(node.right,l);
    }
}