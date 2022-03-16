package POTD;

public class BitWiseAndOfArray {
    int count(int N, int A[], int X)
    {
        int prefix=0,ans=N;
        for(int i=30;i>=0;i--){
            if(((X>>i)&1)!=0){
                prefix^=(1l<<i);
                continue;
            }
            int ct=0;
            long p=prefix^(1l<<i);
            for(int j=0;j<N;j++){
                if((A[j]&p)==p)
                    ct++;
            }
            ans=Math.min(ans,N-ct);
        }
        return ans;
    }
}
