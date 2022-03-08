package LinkedLists;

public class MergedKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ListNode merged = new ListNode(-10001);
        merged.next = lists[0]==null ? null : lists[0];
        for(int i=1;i<lists.length;i++){
            ListNode temp = merged, curr = lists[i];
            while(temp!=null && curr!=null){
                while(temp.next!=null && temp.next.val<=curr.val){
                    temp = temp.next;
                }
                ListNode next = temp.next;
                temp.next = curr;
                curr = curr.next;
                temp = temp.next;
                temp.next = next;
            }
        }
        return merged.next;
    }
}
