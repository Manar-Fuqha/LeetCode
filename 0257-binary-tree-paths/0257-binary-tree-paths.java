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
    List<String> list = new ArrayList();
    public List<String> binaryTreePaths(TreeNode root) {
         paths(root,new String());
         return list;
    }
    private void paths(TreeNode node , String s){
        if(node ==null)return ;
           s+=node.val ;
        if(node.left==null && node.right==null){

            list.add(s);
        }
     s+="->";
        paths(node.left , s);
        paths(node.right,s);

    }
}