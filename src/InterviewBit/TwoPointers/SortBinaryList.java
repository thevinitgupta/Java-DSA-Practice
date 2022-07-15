package InterviewBit.TwoPointers;

import LinkedLists.ListNode;

public class SortBinaryList {
    public ListNode solve(ListNode A) {
        ListNode i = A, j = A;
        while(i!=null && j!=null){
            if(j.val==0){
                int temp = i.val;
                i.val = 0;
                j.val = temp;
                i = i.next;
            }
            j=j.next;
        }
        return A;
    }
}
