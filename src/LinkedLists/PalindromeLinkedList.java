package LinkedLists;

import java.util.*;

public class PalindromeLinkedList {
    static int getSize(ListNode head){
        int count = 1;
        while(head!=null){
            head = head.next;
            count++;
        }
        return count;
    }
    public boolean isPalindrome(ListNode head) {
        int n = getSize(head);
        HashMap<Integer,Integer> map = new HashMap<>();
        ListNode temp = head;
        int i=0;
        while(i<(int)n/2){
            map.put((n-(i+1)),temp.val);
            temp = temp.next;
            i++;
        }
        if(n%2!=0) {
            i++;
            temp = temp.next;
        }
        while(i<n && temp!=null){
            if(map.get(i)!=temp.val) return false;
            i++;
            temp = temp.next;
        }
        return true;
    }
}
