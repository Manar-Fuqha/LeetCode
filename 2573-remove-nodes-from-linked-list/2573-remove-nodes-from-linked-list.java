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
    ListNode l = new ListNode();
    public ListNode removeNodes(ListNode head) {
        findMax(head);
        ListNode node = l;
        while(node.next.next!=null){
            node=node.next;
        }
        node.next=null;
        return l;
    }
    private int findMax(ListNode node ){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int val = findMax(node.next);

        if(node.val>=val){
            ListNode n = node;
            n.next = l;
            l=n;
        }
        return Math.max(node.val , val);
    }
}