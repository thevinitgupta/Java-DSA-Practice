package DoublyLinkedLists;
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
}

public class FlattenMultiLevelDoublyLinkedList {
    public static Node getLast(Node head){
        Node temp = head,prev= null;
        while(temp!=null){
            if(temp.child!=null){
                Node next = temp.next;
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
            prev = temp;
            temp = temp.next;
        }
        return prev;
    }
    public Node flatten(Node head) {
        if(head==null) return head;
        Node temp = head,next = head.next;
        while(temp!=null){
            if(temp.child!=null){
                Node childHead = temp.child;
                Node childEnd = getLast(childHead);
                if(childEnd!=null)
                    childEnd.next = next;
                childHead.prev = temp;
                temp.next = temp.child;
                temp.child = null;
                if(next!=null)
                    next.prev = childEnd;
                temp = childEnd;
            }
            temp = temp.next;
            next = next==null ? null : next.next;
        }
        return head;
    }
}
