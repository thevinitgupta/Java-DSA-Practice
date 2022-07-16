package InterviewBit.LinkedList;

import LinkedLists.ListNode;

public class KthNodeFromNode {
    public int solve(ListNode A, int B) {
        ListNode fast = A, slow = A;
        if(A.next==null) return -1;
        int count = 0;
        while(fast!=null && slow!=null){
            fast = fast.next;
            count++;
            if(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next;
            }
        }
        if(B>count) return -1;
        int steps = count-B;
        fast = A;
        while(steps!=1){
            fast = fast.next;
            steps--;
        }
        return fast.val;
    }
}
