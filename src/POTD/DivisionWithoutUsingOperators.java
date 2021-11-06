package POTD;

public class DivisionWithoutUsingOperators {
    public static long divide(long a, long b)
    {
        long divi=Math.abs(a);
        long div=Math.abs(b);
        long ans=0;
        for(int i=31;i>=0;i--)
        {
            long z= 1<<i;
            long n= div<<i;
            if(z>=0 && (divi-n)>=0)
            {
                ans+=z;
                divi-=n;
            }
        }
        if((a>=0 && b>=0) ||(a<=0 &&b<=0))
            return ans;
        return -ans;
    }
}
