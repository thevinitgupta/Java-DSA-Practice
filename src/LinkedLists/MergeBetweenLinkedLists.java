package LinkedLists;

public class MergeBetweenLinkedLists {
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1,start, end,tail = list2;
        int count = 0;
        while(tail.next!=null){
            tail = tail.next;
        }
        while(temp!=null){
            if(count==a-1) {
                start = temp;
                temp = temp.next;
                start.next = list2;
            }
            else if(count==b) {
                tail.next = temp.next;
                return list1;
            }
            else temp = temp.next;
            count++;
        }
        return list1;
    }
}
