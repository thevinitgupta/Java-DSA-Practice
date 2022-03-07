package POTD;

import Trees.Node;

public class MergeKSortedList {
    class Solution
    {
        Node mergeKList(Node[]arr, int K)
        {
            Node merged = new Node(-1);
            merged.next = arr[0];
            for(int i=1;i<K;i++){
                Node curr = arr[i];
                Node temp = merged;
                while(curr!=null && temp!=null){
                    while(temp.next!=null && temp.next.data<=curr.data){
                        temp = temp.next;
                    }
                    Node next = temp.next;
                    temp.next = curr;
                    curr = curr.next;
                    temp= temp.next;
                    temp.next = next;
                }
            }
            return merged.next;
        }
    }

}
