package Queue;

public class MyQueue {
    int front, rear;
    int arr[] = new int[100005];

    public MyQueue()
    {
        front=0;
        rear=0;
    }

    //Function to push an element x in a queue.
    public void push(int x)
    {
        // Your code here
        if(rear<100005) {
            arr[rear] = x;
            rear++;
        }
    }

    //Function to pop an element from queue and return that element.
    public int pop()
    {
        // Your code here
        if(rear<=front) return -1;
        int ret;
            ret = arr[front];
            front++;
        return ret;
    }
}
