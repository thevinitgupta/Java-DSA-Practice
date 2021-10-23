package Design;

import LinkedLists.MyLinkedList;
import LinkedLists.Node;

public class HashSet {
    MyLinkedList myLL;
    public HashSet() {
        myLL = new MyLinkedList();
    }

    public void add(int key) {
        if(!this.contains(key)) myLL.add(key);
        this.myLL.print(this.myLL.head);
    }

    public void remove(int key) {
        Node prev = null,curr = this.myLL.head;
        while(curr!=null){
            if(curr.data==key) {
                if(prev==null) {
                    this.myLL.head = curr.next;
                }
                else prev.next = curr.next;
                this.myLL.print(this.myLL.head);
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public boolean contains(int key) {
        Node temp = this.myLL.head;
        while(temp!=null) {
            if(temp.data==key) return true;
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(1);
        hs.add(2);
        System.out.println(hs.contains(3));
        hs.add(2);
        hs.remove(1);
        System.out.println(hs.contains(1));
    }
}
