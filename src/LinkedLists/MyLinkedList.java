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
    public void print(Node h){
        Node temp = h;
        while(temp.next!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
