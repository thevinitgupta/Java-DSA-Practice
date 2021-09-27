package POTD;

import LinkedLists.MyLinkedList;
import LinkedLists.Node;

public class MiddleElementOfLinkedList {


    static int getMiddle(Node head)
    {
        // Your code here.
        Node first = head,sec = head;
        while(sec.next!=null){
            first = first.next;
            sec = sec.next;
            if(sec.next!=null) sec = sec.next;
        }
        return first.data;
    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println(getMiddle(ll.head));
    }
}
