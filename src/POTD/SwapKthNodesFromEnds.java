package POTD;

import Trees.Node;

public class SwapKthNodesFromEnds {
    Node swapkthnode(Node head, int num, int K)
    {
        if(K>num) return head;
        int pos = num-(K-1), curr = 1;
        Node dHead = new Node(-1);
        dHead.next = head;
        Node temp = head, prev = dHead, first = null, second = null;
        while(temp!=null){
            if(curr==K) {
                first = prev;
            }
            if(curr==pos) {
                second = prev;
            }
            prev = temp;
            temp = temp.next;
            curr++;
        }
        Node fn = first.next, fnn = fn.next, sn = second.next;
        if(num%2==0 && K==num/2){
            Node snn = sn==null? null : sn.next;
            first.next = sn;
            sn.next = fn;
            fn.next = snn;
            return dHead.next;
        }
        first.next = sn;
        fn.next = sn.next;
        sn.next = fnn;
        second.next = fn;
        return dHead.next;
    }
}
