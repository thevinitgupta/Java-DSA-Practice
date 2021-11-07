package LinkedLists;

import java.util.HashMap;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node temp = head;
        while(temp!=null){
            Node n = new Node(temp.val);
            map.put(temp,n);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            Node copy = map.get(temp);
            copy.next = temp.next==null ? null : map.get(temp.next);
            copy.random =  temp.random==null ? null : map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }
}
