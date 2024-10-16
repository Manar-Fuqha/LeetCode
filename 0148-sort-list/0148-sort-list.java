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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next ==null) return head;
        ListNode m = mid(head);
        ListNode l = sortList(head);
        ListNode r = sortList(m);
        return merge(l ,r);
    }

    private ListNode mid(ListNode head){
        ListNode slow = head , fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next ;
            fast=fast.next.next;
        }
        ListNode mid = slow.next;

        slow.next=null;
        return mid;
    }

    private ListNode merge(ListNode l1 , ListNode l2){
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                curr.next = l1;
                l1=l1.next;

            }
            else{
                curr.next = l2;
                l2=l2.next;
            }
            curr = curr .next;
        }
        curr.next = l1!=null ? l1 :l2; 
           return head.next;
    }


}