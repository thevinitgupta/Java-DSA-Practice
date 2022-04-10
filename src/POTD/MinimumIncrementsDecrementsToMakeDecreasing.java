package POTD;

import java.util.PriorityQueue;

public class MinimumIncrementsDecrementsToMakeDecreasing {
    public static int minOperations(int a[], int n)
    {
        int sum = 0, dif = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++)
        {
            if (!pq.isEmpty() && pq.element() < a[i])
            {
                dif = a[i] - pq.element();
                sum += dif;
                pq.remove();
                pq.add(a[i]);
            }
            pq.add(a[i]);
        }
        return sum;
    }
}
