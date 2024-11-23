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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode();
        ListNode l = head;
        int sum =0;

        while(l1!=null || l2!=null){
            if(l1!=null)
            {sum+=l1.val;
            l1=l1.next;
            }
            if(l2!=null)
            {sum+=l2.val;
            l2=l2.next;
            }

            l.next = new ListNode(sum%10);
            l=l.next;
            if(sum>=10)sum=1;
            else sum=0;
        }
        if(sum==1)l.next = new ListNode(1);
        l=l.next;
return head.next;
    }
}