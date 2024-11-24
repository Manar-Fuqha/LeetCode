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
        int sum =0;
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        ListNode node = l1;
        while(node!=null){
            s1.add(node);
            node=node.next;
        }
        node=l2;
        while(node!=null){
            s2.add(node);
            node=node.next;
        }

        ListNode list =null;
   

        while(!s1.isEmpty() || !s2.isEmpty()|| sum > 0){
            if(!s1.isEmpty()){
                sum+=s1.pop().val;
            }
            if(!s2.isEmpty()){
                sum+=s2.pop().val;
            }
            ListNode temp = new ListNode(sum%10);
            sum/=10;
            temp.next = list;
            list = temp;
        }
        
        return list;
    }
   
}