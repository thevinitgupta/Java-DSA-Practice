package LinkedLists;

import java.util.Arrays;

public class MergedKSortedLists {
    //Faster solution
    public ListNode mergeKListsDivideAndConquer(ListNode[] lists) {
        if(lists.length==0) return null;
        if(lists.length==1) return lists[0];
        int mid = lists.length/2;
        return merge( mergeKLists( Arrays.copyOfRange( lists, 0, mid)), mergeKLists( Arrays.copyOfRange(lists, mid, lists.length)));

    }
    public static ListNode merge(ListNode l1, ListNode l2){
        ListNode merged = new ListNode(-10001);
        ListNode temp = merged, curr = l2;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                while(temp.next!=null && temp.next.val<=l1.val){
                    temp = temp.next;
                }
                ListNode next = temp.next;
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
                temp.next = next;
            }
            else{
                while(temp.next!=null && temp.next.val<=l2.val){
                    temp = temp.next;
                }
                ListNode next = temp.next;
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
                temp.next = next;
            }
        }
        if(l1!=null) temp.next = l1;
        if(l2!=null) temp.next = l2;
        return merged.next;
    }
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
