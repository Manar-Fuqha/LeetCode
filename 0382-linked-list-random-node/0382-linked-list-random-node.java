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

    private ListNode head;
    private Random rand;

    public Solution(ListNode head) {
        this.head = head;
        this.rand = new Random();
    }

    public int getRandom() {
        ListNode result = head;
        ListNode current = head;
        int index = 1;

        while (current != null) {
            if (rand.nextInt(index) == 0) {
                result = current;
            }
            current = current.next;
            index++;
        }

        return result.val;
}
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */