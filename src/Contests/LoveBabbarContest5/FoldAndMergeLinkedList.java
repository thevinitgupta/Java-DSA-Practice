package Contests.LoveBabbarContest5;

import LinkedLists.Node;

/*
* You are given a singly linked list containing ‘N’ nodes (‘N’ is even), where every node in the linked list contains a pointer ‘NEXT’, which points to the next node in the list and has an integer value associated with it.
Your task is to break LinkedList into two halves and then take the first half, fold it over the second half and merge all the intersecting nodes by taking their product.
*
* */


public class FoldAndMergeLinkedList {
    public static Node foldAndMerge(Node head) {
        // Write your code here.
        Node slow = head,fast = head, h1 = head, h2 = null;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        h2 = slow.next;
        slow.next = null;
        Node temp1 = h1;
        Node temp2 = reverse(h2);
        while(temp1!=null && temp2!=null){
            temp1.data *= temp2.data;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return reverse(h1);
    }
    public static Node reverse(Node head){
        Node dh = new Node(-1);
        dh.next = head;
        if(head.next==null) return head;
        Node prev = dh, curr = head,next = head.next;
        while(curr!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr==null? null : curr.next;
        }
        head.next = null;
        return prev;
    }
}
