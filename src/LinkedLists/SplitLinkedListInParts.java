package LinkedLists;

public class SplitLinkedListInParts {
    public static int getSize(ListNode head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode [] parts = new ListNode[k];
        if(head==null) return parts;
        int n = getSize(head),currCount = 1,idx = 0;
        int winSize = n>k ? n/k : 1;
        int rem = n>k? n%k : 0;
        ListNode temp = head, next = head.next;
        while(temp!=null){
            if(rem==0 && currCount==winSize){
                temp.next = null;
                parts[idx] = head;
                head = next;
                idx++;
                currCount = 0;
            }
            else if(currCount==(winSize+1)){
                temp.next = null;
                parts[idx] = head;
                head = next;
                idx++;
                currCount = 0;
                rem--;
            }
            temp = next;
            next = temp==null? null : temp.next;
            currCount++;
        }
        return parts;
    }
}
