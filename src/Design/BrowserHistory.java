package Design;

class ListNode {
    String val;
    ListNode next;
    ListNode() {}
    ListNode(String val) {
        this.val = val;
    }
}

public class BrowserHistory {
    public ListNode head;
    ListNode current;
    int length = 0,currPos = 0;
    public BrowserHistory(String homepage) {
        ListNode newNode  = new ListNode(homepage);
        this.head = newNode;
        this.current = this.head;
        this.length=1;
        this.currPos=1;
    }

    public void visit(String url) {
        ListNode newNode = new ListNode(url);
        this.current.next = newNode;
        this.current = this.current.next;
        this.length++;
        this.currPos++;

    }

    public String back(int steps) {
        if(steps>=(this.currPos)) {
            this.current = this.head;
            this.currPos = 1;
        }
        else {
            int moves = this.currPos - (steps+1);
            this.currPos = moves;
            moves = 1;
            ListNode temp = this.head;
            while(moves<this.currPos){
                temp = temp.next;
                moves++;
            }
            this.current = temp;
        }
        return this.current.val;
    }

    public String forward(int steps) {
        ListNode temp = this.current;
        while(temp.next!=null && steps>0){
            temp = temp.next;
            steps--;
            this.currPos++;
        }
        this.current = temp;
        return this.current.val;
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory("leetcode.com");
        bh.visit("facebook.com");
        bh.visit("google.com");
        bh.visit("geeksforgeeks.com");
        bh.visit("tablt.com");
        System.out.println(bh.back(3));
        System.out.println(bh.forward(5));
        System.out.println(bh.back(1));
    }
}
