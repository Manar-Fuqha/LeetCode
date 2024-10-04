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
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        Set<ListNode> set = new HashSet<>();
        ListNode node = head ;
       
       while(node.next!=null && !set.contains(node)){
        if(set.contains(node))return true;
        if(node.next==null)return false;
        set.add(node);
        node=node.next;
       }
        if(node.next==null)return false;
        return true;
    }
}