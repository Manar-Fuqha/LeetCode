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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode node = head ;
        while(node.next!=null){
            ListNode newNode = findGCD(node , node.next);
            newNode.next=node.next;
            node.next=newNode;
            node =node.next.next;
        }
        return head;
    }
    private ListNode findGCD(ListNode left , ListNode right){
        int a = left.val , b = right.val;
        int i = a<b ?a :b;
        for(i=i;i>1;i--){
            if(a%i ==0 && b%i==0) break;
        }
        return new ListNode(i);
    }
}