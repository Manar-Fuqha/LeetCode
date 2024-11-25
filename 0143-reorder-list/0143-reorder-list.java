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
    public void reorderList(ListNode head) {
         if (head == null || head.next == null) {
        return ;
    }
        ListNode mid = FindMidPoint(head);
        ListNode secondHalf = reverseLinkedList(mid.next);
        mid.next = null;
        ListNode node = head;
        while(node!=null && secondHalf!=null){
            ListNode temp1 = node.next;
            ListNode temp2 = secondHalf.next;
            node.next = secondHalf;
            secondHalf.next = temp1;
            node = temp1;
            secondHalf= temp2;
        }
    

    }
    private ListNode FindMidPoint(ListNode head){
        ListNode slow = head , fast=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next ;
            fast = fast.next.next;
        }
        return slow;
    }
   private ListNode reverseLinkedList(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }

    ListNode reversedList = reverseLinkedList(head.next);
    head.next.next = head;
    head.next = null;

    return reversedList;
}
}