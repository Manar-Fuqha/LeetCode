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
     List<Integer> list=new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)return list;
        if(root.left==null&&root.right==null){
            list.add(root.val);
            return list;
        }
       return postorder(root);
    }

    public List<Integer> postorder(TreeNode node){
        if(node==null)return list;

       postorder(node.left);
            list.add(node.val);

        postorder(node.right);

        return list;
    }
    }
