package POTD;

import Queue.MyQueue;

public class ImplementQueueUsingArray {
    public static void main(String[] args) {
        MyQueue m = new MyQueue();
        int [] queries = {1, 2, 1, 3, 2, 1, 4, 2};
        for(int i=0;i<queries.length;i=i+2){
            if(queries[i]==1){
                m.push(queries[i+1]);
            }
            else {
                System.out.println(m.pop());
            }
        }
    }
}
