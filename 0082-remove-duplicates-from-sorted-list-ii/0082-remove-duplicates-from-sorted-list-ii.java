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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev =dummy;


        while(head!=null){
            if(head.next != null && head.val == head.next.val){
                while(head.next != null && head.val == head.next.val)
                head=head.next;

                prev.next=head.next;
            }
            else{
                prev=prev.next;
            }
             head = head.next;
           
        }
        return dummy.next;




























        // ListNode node = head ;
        // ListNode list = new ListNode(0); 
        // ListNode l = list;

        // while(node!=null ){
        //     if(node.next!=null && node.val ==node.next.val){
        //         ListNode temp = node;
        //         while(temp.val==node.val){
        //             if(temp.next!=null)temp=temp.next;
        //         }
        //         node=temp;
        //         continue;}
        //         else{
        //              l.next = node ; 
        //              l=l.next;
        
        //              node=node.next;
        //         }
        // }

        // return list.next;








    }
}