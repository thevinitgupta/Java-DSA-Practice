package POTD;

import LinkedLists.Node;

public class InsertionSortedInLL {
    public static Node insertionSort(Node head)
    {
        Node sorted = new Node(0);
        sorted.next = head;
        head = head.next;
        Node temp = sorted.next;
        temp.next = null;
        insert(head,sorted);
        return sorted.next;
    }
    public static void insert(Node head, Node sorted){
        if(head==null) return;
        Node temp = head,curr = sorted.next, prev = sorted;
        while(curr!=null && temp.data>curr.data){
            prev = curr;
            curr= curr.next;
        }
        prev.next = temp;
        head = head.next;
        temp.next = curr;
        insert(head,sorted);
        return ;
    }
}
