package Contests.WeeklyContests;

import LinkedLists.ListNode;

public class MergeNodesInBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode h1 = new ListNode(),temp = head.next,temp1 = h1;
        int sum = 0;
        while(temp!=null){
            if(temp.val==0) {
                temp1.next = new ListNode(sum);
                temp1 = temp1.next;
                sum = 0;
            }
            sum += temp.val;
            temp = temp.next;
        }
        return h1.next;
    }
}
