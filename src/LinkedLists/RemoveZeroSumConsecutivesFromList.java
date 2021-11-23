package LinkedLists;

public class RemoveZeroSumConsecutivesFromList {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode temp = head,prev = head;
        while(temp!=null){
            if(temp.val==0){
                if(temp!=head) {
                    prev.next = temp.next;
                }
                else {
                    head = head.next;
                    temp = head;
                }
            }
            else prev = temp;
            temp = temp==null ? null : temp.next;
        }
        if(head==null || head.val==0) return null;
        temp = head;
        prev = temp;
        while(temp.next!=null){
            ListNode zeroNode = getSums(temp);
            if(zeroNode==null) {
                prev = temp;
                temp = temp.next;
            }
            else {
                if(temp==head) {
                    if(zeroNode.next==null) return null;
                    head = zeroNode.next;
                }

                else prev.next = zeroNode.next;
                temp = head;
                prev = temp;
            }
        }
        return head;
    }
    public static ListNode getSums(ListNode head){
        ListNode temp = head;
        int sum = temp.val;
        temp = temp.next;
        while(temp!=null){
            sum = sum + temp.val;
            if(sum==0) return temp;
            temp = temp.next;
        }
        return null;
    }
}
