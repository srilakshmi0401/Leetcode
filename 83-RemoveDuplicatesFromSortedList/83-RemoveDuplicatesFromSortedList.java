// Last updated: 8/12/2026, 12:15:50 PM
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) return null;

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        ListNode curr = head;

        while (curr != null) {

            tail.next = new ListNode(curr.val);
            tail = tail.next;

            while (curr.next != null &&
                   curr.val == curr.next.val) {
                curr = curr.next;
            }

            curr = curr.next;
        }

        return dummy.next;
    }
}