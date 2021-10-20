package LinkedLists;



public class ConvertBinaryNumberInLinkedListToInteger {
    public static int getDecimalValue(Node head) {
        int value = 0;
        int n = 0;
        Node temp = head;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        int j=n-1;
        temp = head;
        while(temp!=null){
            value += temp.data * Math.pow(2,j);
            j--;
            temp = temp.next;
        }
        return value;
    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(1);
        ll.add(0);
        ll.add(0);
        ll.add(0);
        ll.add(1);
        ll.add(1);
        ll.add(0);
        ll.add(0);
        System.out.println(getDecimalValue(ll.head));
    }
}
