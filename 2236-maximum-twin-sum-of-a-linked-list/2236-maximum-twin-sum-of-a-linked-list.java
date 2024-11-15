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
    public int pairSum(ListNode head) {
        ListNode slow = head,
        fast = head;

       while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode node = reverseList(slow ) ;


        int max = head.val+node.val;
        head=head.next;
        node=node.next;
        while(head!=null && node!=null){
            int sum = head.val+node.val;
            if(sum>max)max=sum;
            head=head.next;
            node=node.next;
        }
        return max;
    }
   private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

}