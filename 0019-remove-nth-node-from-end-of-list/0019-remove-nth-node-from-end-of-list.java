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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)return null;
        if(head.next==null&&n==1)return null;
        ListNode node= head;
        ListNode tail = head;
        int size=1;
        while(tail.next!=null){
            tail=tail.next;
            size++;
        }
        for(int i=0;i<size-n-1;i++){
            if(node==null)return head;
            node=node.next;
        }
       
            if(node==null)return head;
            
            if(size==n){
                head=head.next;
                return head;
            }
            if(node.next==null||node.next.next==null){
                node.next=null;
            }
            else{
            node.next=node.next.next;
            }
      
            return head;
    }
}