package POTD;

import java.util.Arrays;
import java.util.Comparator;

public class TheftAtWorldBank {
    public double maximumProfit(int n, long C, long w[], long p[])
    {
        Item[] arr=new Item[n];
        for(int i=0;i<n;i++) {
            arr[i]=new Item(p[i],w[i]);
        }
        return fractionalKnapsack(C,arr,n);
    }
    static double fractionalKnapsack(long W, Item arr[], int n)
    {
        Arrays.sort(arr, new ItemComparator());

        double profit = 0d;
        double curr=0;
        double ans=0;
        for (int i = 0; i < n; i++)
        {
            long x=(long)Math.sqrt(arr[i].weight);
            if(x*x==arr[i].weight)continue;
            if (curr + arr[i].weight <= W) {
                curr += arr[i].weight;
                ans += arr[i].value;
            }
            else {
                double left = W - curr;
                ans += (double) (arr[i].value * left) / arr[i].weight;
                break;
            }
        }
        return ans;
    }
}

class ItemComparator implements Comparator<Item> {
    public int compare(Item a, Item b) {
        double A = a.value * 1.0d / a.weight;
        double B = b.value * 1.0d / b.weight;

        if (A < B)
            return 1;

        else if (A > B)
            return -1;

        return 0;
    }
}

class Item {
    long value, weight;
    Item(long x, long y){
        this.value = x;
        this.weight = y;
    }
}
