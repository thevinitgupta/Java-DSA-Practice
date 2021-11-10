package POTD;

import LinkedLists.Node;

import static LinkedLists.ReverseLinkedList.reverseList;

public class CheckIfListIsPalindrome {
    public static int getSize(Node head){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    boolean isPalindrome(Node head)
    {
        //Your code here
        if(head.next == null) return true;
        //0 based size
        int n = getSize(head);
        int  mid = n/2;
        int count = 0;
        Node temp = head;

        //loop to reach the middle element after which the reversing will begin
        while (count<mid-1){
            temp = temp.next;
            count++;
        }
        Node rev = temp.next;
        temp.next = null;
        rev = reverseList(rev);
        Node tr = rev;
        temp = head;
        while(temp!=null && tr!=null){
            if(temp.data != tr.data) return false;
            temp = temp.next;
            tr = tr.next;
        }
        return true;
    }
}
