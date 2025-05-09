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
class BSTIterator {
    Stack<Integer> stack ;

    public BSTIterator(TreeNode root) {
       stack  = new Stack<>();
       addToStack(root);
    }
    
    public int next() {
        return stack.pop();
    }
    
    public boolean hasNext() {
        return stack.size()>0;
    }

private void addToStack(TreeNode root){
     if(root==null)return;
        addToStack(root.right);
        stack.add(root.val);
        addToStack(root.left);
}
}
/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */