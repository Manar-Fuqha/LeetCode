/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         if(head==null)return null;
        Set<ListNode> set = new HashSet<>();
        ListNode node = head ;
       
       while(node.next!=null && !set.contains(node)){
        if(set.contains(node))return node;
        if(node.next==null)return null;
        set.add(node);
        node=node.next;
       }
        if(node.next==null)return null;
        return  node;
    }
}