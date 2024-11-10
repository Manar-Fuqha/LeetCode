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
    public ListNode mergeNodes(ListNode head) {
        ListNode node = head.next ,
        newNode =head,
        newhead=newNode;
        int sum =0;

        while(node!=null){
            if(node.val !=0 ){
                sum+=node.val;
            }
            if(node.val==0){
                newNode.next = new ListNode(sum);
                newNode= newNode.next;
                sum=0;
            }

            node=node.next;
        }
        return newhead.next;
    }
}