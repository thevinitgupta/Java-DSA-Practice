package LinkedLists;

public class ReverseLinkedList {
    public static Node reverseList(Node head) {
        if(head==null || head.next==null) return head;
        Node prev= null,curr = head,next = head.next;
        while(curr.next!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }
        curr.next = prev;
        head = curr;
        return head;
    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(1);
        ll.add(4);
        ll.add(3);
        ll.add(6);
        ll.add(11);
        System.out.println("\nOriginal : ");
        ll.print(ll.head);
        System.out.println("\n\nReversed :");
        ll.head = reverseList(ll.head);
        ll.print(ll.head);
    }
}
