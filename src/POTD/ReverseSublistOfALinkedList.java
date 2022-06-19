package POTD;

import Trees.Node;

public class ReverseSublistOfALinkedList {
    public static Node reverseBetween(Node head, int m, int n)
    {
        Node dHead = new Node(-1), prev = dHead, connect = null, temp = head;
        dHead.next = head;
        int count = 0;
        while(temp!=null){
            count++;
            if(count<m){
                prev = temp;
            }
            if(count==n){
                connect = temp.next;
                temp.next = null;
            }
            temp = temp.next;
        }

        prev.next = reverse(prev.next, connect);

        return dHead.next;


    }
    static Node reverse(Node head, Node prev){
        Node temp = head;
        while(temp!=null){
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}
