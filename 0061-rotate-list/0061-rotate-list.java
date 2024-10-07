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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        if(head.next==null)return head;
        ListNode node =head;
        int size=1;
        while(node.next!=null){
            node=node.next;
            size++;
        }
        k=k%size;
        for(int i=0;i<k;i++){
        ListNode tail = head ; 
        ListNode pre = head;

        while(tail.next!=null){
            pre=tail;
            tail=tail.next;
        }
        tail.next=head;
        head=tail;
        pre.next=null;
        }
        return head;
    }
}