package LinkedLists;
/*
Write a function to delete a node in a singly-linked list.
You will not be given access to the head of the list,
instead you will be given access to the node to be deleted directly.
* */
public class DeleteNodeInLinkedList {
    public void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        System.out.println("Correct Program!!");
    }
}
