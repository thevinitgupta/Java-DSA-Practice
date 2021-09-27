package POTD;


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
}
