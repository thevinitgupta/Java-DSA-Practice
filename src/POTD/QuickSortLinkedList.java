package POTD;

import LinkedLists.Node;

public class QuickSortLinkedList {
    public static Node quickSort(Node node)
    {
        if (node == null || node.next == null)
            return node;

        Node tail = node;
        while (tail.next != null) tail = tail.next;

        quickSort(node, tail);

        return node;
    }

    static void quickSort(Node head, Node tail) {
        if (head == tail)   return;
        Node[] p = partition(head, tail);

        Node leftTail = p[0];
        Node rightHead = p[1];

        if (leftTail != null) quickSort(head, leftTail);
        if (rightHead != null) quickSort(rightHead, tail);
    }

    static Node[] partition(Node head, Node tail) {
        Node[] out = new Node[2];
        Node i = null, j = head;

        while (j != tail) {
            if (j.data <= tail.data) {
                if (i == null) {
                    i = head;
                } else {
                    i = i.next;
                }

                swap(i, j);
            }
            j = j.next;
        }
        if (i != null) {
            swap(i.next, tail);
            out[0] = i;
            out[1] = out[0].next;
        } else {
            swap(head, tail);
            out[0] = head;
            out[1] = head.next;
        }

        return out;
    }

    static void swap(Node x, Node y) {
        int temp = x.data;
        x.data = y.data;
        y.data = temp;
    }
}
