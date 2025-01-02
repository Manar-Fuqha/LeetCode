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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        CountFrequently(root , hash);
        int max=0;
        for(int val : hash.values()){
            if(val>max)max=val;
        }
        for(int key : hash.keySet()){
            if(hash.get(key)==max){
                list.add(key);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    private void CountFrequently(TreeNode node , HashMap<Integer,Integer> hash){
        if(node==null)return;
        CountFrequently(node.left , hash);
        hash.put(node.val , hash.getOrDefault(node.val , 0)+1);
        CountFrequently(node.right , hash);
    } 
}