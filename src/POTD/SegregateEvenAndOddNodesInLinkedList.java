package POTD;

import LinkedLists.*;

// 17 -> 15 -> 8 -> 9 -> 2 -> 4 -> 6
public class SegregateEvenAndOddNodesInLinkedList {
    static Node divide(int N, Node head){
        // code here
        Node eHead = new Node(-1);
        Node oHead = new Node(-1);
        Node temp = head,even = eHead,odd = oHead;
        while(temp!=null){
            Node n = new Node(temp.data);
            if(temp.data%2==0) {
                even.next = n;
                even = even.next;
            }
            else {
                odd.next = n;
                odd = odd.next;
            }
            temp = temp.next;
        }
        even.next = oHead.next;
        return eHead.next;
    }

    public static void main(String[] args) {
        MyLinkedList myLl = new MyLinkedList();
        myLl.add(17);
        myLl.add(15);
        myLl.add(8);
        myLl.add(9);
        myLl.add(2);
        myLl.add(4);
        myLl.add(6);
        myLl.print(myLl.head);
        Node segregatedHead = divide(7, myLl.head);
        myLl.print(segregatedHead);
    }
}
