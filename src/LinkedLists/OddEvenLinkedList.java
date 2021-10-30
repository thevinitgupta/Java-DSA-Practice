package LinkedLists;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode eHead = new ListNode();
        ListNode oHead = new ListNode();
        ListNode temp = head,tempO = oHead, tempE = eHead;
        int count = 1;
        while(temp!=null){
            if(count%2==0){
                tempE.next = temp;
                temp = temp.next;
                tempE = tempE.next;
                tempE.next = null;
            }
            else {
                tempO.next = temp;
                temp = temp.next;
                tempO = tempO.next;
                tempO.next = null;
            }
            count++;
        }
        tempO.next = eHead.next;
        return oHead.next;
    }
}
