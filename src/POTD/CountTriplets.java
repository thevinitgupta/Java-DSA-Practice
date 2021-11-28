package POTD;

import LinkedLists.Node;

import java.util.HashMap;

public class CountTriplets {
    static int countTriplets(Node head, int x)
    {
        //code here.
        if(head.next==null || head.next.next==null) return 0;
        HashMap<Integer,Node> map = new HashMap<>();
        Node temp = head;
        while(temp!=null){
            map.put(temp.data,temp);
            temp = temp.next;
        }
        temp = head;
        Node t1 = head,t2 = head.next;
        int count=0;
        while(t1.next.next!=null){
            t2 = t1.next;
            while(t2.next!=null){
                int val = x - (t1.data+t2.data);
                if(val < t2.data && map.containsKey(val)){
                    count++;
                }
                t2 = t2.next;
            }
            t1 = t1.next;
        }
        return count;
    }
}
