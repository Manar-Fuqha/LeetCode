/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
          ListNode node1=headA;
      ListNode node2=headB;

      while(node1!=node2){
        node1=node1.next;
        node2=node2.next;
        if(node1==null&&node2!=null)node1=headB;
        if(node2==null&&node1!=null)node2=headA;
        
        
      }
      return node1;
    }
} 



//  ListNode node1= headA;

    //     while(node1!=null){
    //         if(findNode(headB,node1)){
    //             return node1;
    //         }
    //         node1=node1.next;
    //     }
    //     return null;
    // }

    // public boolean findNode(ListNode headB , ListNode node){
    //     while(headB!=null){
    //         if(headB==node){
    //             return true;
    //         }
    //         headB=headB.next;
    //     }
    //     return false;