package LinkedLists;

import java.util.HashMap;

public class CopyListWithRandomPointer {
    public Node copyRandomList2(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node temp = head , prev = head;
        while(temp!=null){
            Node curr = new Node(temp.val);
            if(temp!=head){
                Node ptr = map.get(prev);
                ptr.next = curr;
            }
            map.put(temp, curr);
            prev = temp;
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            Node curr = map.get(temp);
            Node rand = temp.random;
            curr.random = map.get(rand);
            temp = temp.next;
        }
        return map.get(head);
    }

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
