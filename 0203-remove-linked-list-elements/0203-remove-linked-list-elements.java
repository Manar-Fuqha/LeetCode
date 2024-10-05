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
    public ListNode removeElements(ListNode head, int val) {
     
        while(head!=null&&head.val==val)head=head.next;
           if(head==null)return null;
        ListNode node=head;
        ListNode pre=node;
        while(node!=null){
            if(node.val==val){
                if(pre.next.next==null){
                    pre.next=null;
                    return head;
                }
                else{
                    pre.next=pre.next.next;
                }
            }
            else{
            pre=node;

            }
            node=node.next;
        }
        return head;
    }
}