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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)return list2;
        if(list2==null)return list1;
        ListNode list3=new ListNode();
        ListNode n1= list1,
         n2=list2,
         n3=list3;

        while(n1!=null&&n2!=null){
            if(n1.val<n2.val){
                n3.next=n1;
                n3=n3.next;
                n1=n1.next;
            }
            else{
                n3.next=n2;
                n3=n3.next;
                n2=n2.next;
            }
        }
        while(n1!=null){
            n3.next=n1;
            n3=n3.next;
            n1=n1.next;
        }
        while(n2!=null){
            n3.next=n2;
            n3=n3.next;
            n2=n2.next;
        }
        list3=list3.next;
        return list3;
    }
}