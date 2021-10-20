package LinkedLists;

/*
* Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
* */

public class ReturnMiddle {
    public static Node middleNode(Node head) {
        if(head.next==null) return head;
        Node f = head,s = head;
        int n = 1;
        while(s.next!=null){
           f = f.next;
           s = s.next;
           if(s.next!=null){
               s = s.next;
               n++;
           }
           n++;
        }
        return f;
    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(1);
        ll.add(4);
        ll.add(3);
        ll.add(6);
        ll.add(11);
        Node mid = middleNode(ll.head);
        System.out.println(mid.data);
    }
}
