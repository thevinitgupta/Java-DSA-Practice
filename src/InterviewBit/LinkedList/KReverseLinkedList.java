package InterviewBit.LinkedList;

import LinkedLists.ListNode;

public class KReverseLinkedList {
    public ListNode reverseList(ListNode A, int B) {
        ListNode current = A;
        ListNode next = null;
        ListNode prev = null;

        int count = 0;

        while (count < B && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null)
            A.next = reverseList(next, B);

        return prev;
    }
}
