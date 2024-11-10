/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        ListNode node = head ;
        int count =0;

        while(node!=null ){
            if(contains(nums , node.val) &&
                ( node.next==null || !contains(nums , node.next.val))) {
                count++;
                
            } 
             node=node.next;
        }
        return count;
    }
    private boolean contains(int[] nums , int val){
        for(int i : nums){
            if(i == val) return true;
        }
        return false;
    }
}