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
    public boolean isPalindrome(ListNode head) {
        if(head==null ||head.next==null)return true;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
     ListNode reverse= reverseList(slow);
     ListNode node=head;
     while(reverse!=null){
        if(node.val!=reverse.val)return false;
        node=node.next;
        reverse=reverse.next;
     }
     return true;

    }
    public ListNode reverseList(ListNode head){
        ListNode tail=null;
       while(head!=null){
        ListNode node=head.next;
        head.next=tail;
        tail=head;
        head=node;
       }
       return tail;
    }
}