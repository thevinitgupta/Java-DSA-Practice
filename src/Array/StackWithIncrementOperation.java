
package Array;
class CustomStack {
    int top = -1,maxSize = 0;
    int [] stack;
    public CustomStack(int maxSize) {
        this.stack = new int[maxSize];
        this.maxSize = maxSize;
    }
    public boolean push(int x) {
        if(top==maxSize-1){
            return false;
        }
        stack[++top] = x;
        return true;
    }

    public int pop() {
        if(top==-1){
            return -1;
        }
        int popped = stack[top];
        this.top--;
        return popped;
    }

    public boolean increment(int k, int val) {
        if(k>top) k = top+1;
        for(int i=0;i<k;i++){
            stack[i] += val;
        }
        return true;
    }
}

/*
* Q-1381 Design A Stack with Increment Operation
*
* Statement :
* Design a stack which supports the following operations.

Implement the CustomStack class:

CustomStack(int maxSize) Initializes the object with maxSize which is the maximum number of elements in the stack or do nothing if the stack reached the maxSize.
void push(int x) Adds x to the top of the stack if the stack hasn't reached the maxSize.
int pop() Pops and returns the top of stack or -1 if the stack is empty.
void inc(int k, int val) Increments the bottom k elements of the stack by val. If there are less than k elements in the stack, just increment all the elements in the stack.


Example 1:

Input
["CustomStack","push","push","pop","push","push","push","increment","increment","pop","pop","pop","pop"]
[[3],[1],[2],[],[2],[3],[4],[5,100],[2,100],[],[],[],[]]
Output
[null,null,null,2,null,null,null,null,null,103,202,201,-1]

* */

public class StackWithIncrementOperation {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(3);
        System.out.println(stack.push(1));
        System.out.println(stack.push(2));
        System.out.println(stack.pop());
        System.out.println(stack.push(2));
        System.out.println(stack.push(3));
        System.out.println(stack.push(4));
        System.out.println(stack.increment(5,100));
        System.out.println(stack.increment(2,100));
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

