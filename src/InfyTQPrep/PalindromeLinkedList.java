package InfyTQPrep;

import LinkedLists.ListNode;

public class PalindromeLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        slow.next = null;
        mid = reverseList(mid);
        slow = head;
        while(slow!=null && mid!=null){
            if(slow.val!=mid.val) return false;
            slow= slow.next;
            mid = mid.next;
        }
        return true;
    }
}
