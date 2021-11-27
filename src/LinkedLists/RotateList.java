package LinkedLists;

public class RotateList {
    public static int getSize(ListNode head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int n = getSize(head);
        if(n==k || (k>n && k%n==0)) return head;
        k = k % n;
        int pos = n-k,c = 0;
        ListNode temp = head, prev = head,tail = head;
        while(tail.next!=null){
            if(c<pos){
                prev = temp;
                temp = temp.next;
                c++;
            }
            tail = tail.next;
        }
        prev.next = null;
        tail.next = head;
        head = temp;
        return head;

    }
}
