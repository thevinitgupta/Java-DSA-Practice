package POTD;

import LinkedLists.Node;

public class FindNbyKthNodeLinkedList {
    public static int getSize(Node head){
        int count=0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static int nknode(Node head, int k)
    {
        // add your code here
        int n = getSize(head);
        int c = (int) n/k;
        if(n%k!=0) c++;
        Node temp = head;
        while(c!=1 && temp!=null){
            temp = temp.next;
            c--;
        }
        return temp==null ? -1 : temp.data;
    }
}
