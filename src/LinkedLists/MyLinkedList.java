package LinkedLists;

public class MyLinkedList {
    public Node head;
    public void add(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
}
