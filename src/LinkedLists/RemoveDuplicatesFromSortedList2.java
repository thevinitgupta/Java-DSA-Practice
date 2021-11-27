package LinkedLists;

public class RemoveDuplicatesFromSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head,prev = head;
        while(temp!=null){
            int count = 0;
            boolean isHead = false;
            while(temp.next!=null && temp.val==temp.next.val){
                if(temp==head) isHead = true;
                temp = temp.next;
                count++;
            }
            if(count>0) {
                if(isHead){
                    head = temp.next;
                    prev = head;
                    temp = head;
                }
                else {
                    prev.next = temp.next;
                    temp = temp.next;
                }
            }
            else {
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}
