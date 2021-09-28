package POTD;

import java.util.Stack;

/*
* Stack :  11 2 32 3 41
* 1 : pop-41 s : 11 2 32 3
* */
public class SortTheStack {
    public static Stack<Integer> sort(Stack<Integer> s)
    {
        //add code here.
        for(int i=0;i<s.capacity();i++){
            s = descending(s);
        }
        return s;
    }
    static Stack<Integer> descending(Stack<Integer> s){
        int popped = s.pop();
        if(s.isEmpty()) {
            s.push(popped);
            return s;
        }
        if(popped<s.peek()){
            int temp = s.pop();
            s.push(popped);
            popped = temp;
        }
        s = descending(s);
        if(s.peek()>popped){
            int temp = s.pop();
            s.push(popped);
            popped = temp;
        }
        s.push(popped);
        return s;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(11);
        s.push(2);
        s.push(32);
        s.push(3);
        s.push(41);
        s= sort(s);
        System.out.println(s);
    }
}
