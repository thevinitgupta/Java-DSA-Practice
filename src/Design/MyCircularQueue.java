package Design;

public class MyCircularQueue {
    int [] cq;
    int front, rear,capacity, len;
    public MyCircularQueue(int k) {
        cq = new int[k];
        front = 0;
        rear = -1;
        capacity = k;
        len=0;
    }

    public boolean enQueue(int value) {
        if(this.isFull()) return false;
        rear = (rear+1)%capacity;
        cq[rear] = value;
        len++;
        return true;
    }

    public boolean deQueue() {
        if(this.isEmpty()) return false;
        front = (front+1)%capacity;
        len--;
        return true;
    }

    public int Front() {
        if(this.isEmpty()) return -1;
        return cq[front];
    }

    public int Rear() {
        if(this.isEmpty()) return -1;
        return cq[rear];
    }

    public boolean isEmpty() {
        return len==0;
    }

    public boolean isFull() {
        return len==capacity;
    }
}
