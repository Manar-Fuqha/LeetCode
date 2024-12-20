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
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) return true;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean evenLevel = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int prevValue = evenLevel ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                if (evenLevel) {
                    if (curr.val % 2 == 0 || curr.val <= prevValue) return false;
                } else {
                    if (curr.val % 2 != 0 || curr.val >= prevValue) return false;
                }

                prevValue = curr.val;

                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }

            evenLevel = !evenLevel;
        }

        return true;
    }
}