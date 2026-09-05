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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        int count = 1;
        ListNode temp = head;

        while (temp.next != null) {
            count++;
            temp = temp.next;
        }

        k %= count;
        if (k == 0) return head;

        temp.next = head;
        temp = head;
        while (count - k > 1) {
            temp = temp.next;
            count--;
        }
        head = temp.next;
        temp.next = null;

        return head;
        
    }
}