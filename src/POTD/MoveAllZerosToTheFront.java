package POTD;

import Trees.Node;

public class MoveAllZerosToTheFront {
    public Node moveZeroes(Node head){
        Node dHead = new Node(-1);
        dHead.next = head;
        Node temp = head, prev = dHead;
        while(temp!=null){
            if(temp.data==0 && temp!=head){
                prev.next = temp.next;
                dHead.next = temp;
                temp.next = head;
                head = temp;
                temp = prev;
            }
            prev = temp;
            temp = temp.next;
        }
        return dHead.next;
    }
}
