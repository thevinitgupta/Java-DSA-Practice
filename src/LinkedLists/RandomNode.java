package LinkedLists;

public class RandomNode {
    public ListNode head;
    int length = 0;
    public RandomNode(ListNode head) {
        this.head = head;
        this.getSize();
    }
    public void getSize(){
       int count = 0;
       ListNode temp = this.head;
       while(temp!=null){
           count++;
           temp = temp.next;
       }
       setSize(count);
    }
    void setSize(int n){
        this.length = n;
    }
    public int getRandom() {
        int k =  (int)(Math.random() * this.length);
        ListNode temp = this.head;
        while(k>0){
            temp = temp.next;
            k--;
        }
        return temp.val;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(10);
        l1.next.next.next = new ListNode(3);
        RandomNode rn = new RandomNode(l1);
        System.out.println(rn.getRandom());
    }
}
