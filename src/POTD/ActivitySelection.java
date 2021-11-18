package POTD;


import java.util.Arrays;
import java.util.Comparator;

class Pair2
{
    int first, second;
    public Pair2(int start, int end)
    {
        this.first = start;
        this.second = end;
    }
}

public class ActivitySelection {
    public static int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        Pair2[] l =new Pair2[n];
        for(int i=0 ;i< n;i++)
        {
            l[i]=new Pair2(start[i],end[i]);
        }
        Arrays.sort(l,new Comparator<Pair2>(){
            @Override
            public int compare(Pair2 a,Pair2 b)
            {
                return a.second-b.second;
            }
        });
        int prev=-1, count=0;
        for(int i=0;i<n;i++)
        {
            if(prev <l[i].first)
            {
                count++;
                prev=l[i].second;
            }
        }
        return count;
    }
}
