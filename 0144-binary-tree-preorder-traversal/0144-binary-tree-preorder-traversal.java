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
    List<Integer> list = new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)return list;
        if(root.left==null&&root.right==null){
            list.add(root.val);
            return list;
        }
        return preorder(root);
    }

    public List<Integer> preorder (TreeNode node){
        if(node==null) return list;
        list.add(node.val);
        preorder(node.left);
        preorder(node.right);
        return list;
    }
}