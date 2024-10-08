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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode node=head.next ;
        ListNode pre = head;
        Set<Integer> set = new HashSet<>();
for(int i=0;i<nums.length;i++){
           set.add(nums[i]);
        }
        while(node!=null){
            if(set.contains(node.val)){
                pre.next = node.next ;

            node=node.next;
            }
            else{
              pre=node;
            node=node.next;
            }
            

        }
         if(set.contains( head.val)){
                head =head.next;
                
            }
            return head;
    }

}