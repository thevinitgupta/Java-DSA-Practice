package DoublyLinkedLists;
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
}

public class FlattenMultiLevelDoublyLinkedList {
    public Node flatten(Node head) {
        if(head==null || head.next==null && head.child==null) return head;
        Node temp = head,next = head.next;
        while(temp!=null){
            if(temp.child!=null){
                Node childHead = temp.child;
                Node childEnd = getLast(childHead);
                childEnd.next = next;
                childHead.prev = temp;
                temp.next = temp.child;
                temp.child = null;
                if(next!=null)
                next.prev = childEnd;
                temp = childEnd;
            }
            temp = temp.next;
            next = next.next;
        }
        return head;
    }
    public static Node getLast(Node head){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        return temp;
    }
}
