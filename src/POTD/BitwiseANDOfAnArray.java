package POTD;

public class BitwiseANDOfAnArray {
    static int count(int N, int A[], int X)
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

    public static void main(String[] args) {
        int [] arr = {1,2,4};
        System.out.println(count(3,arr,6));
    }
}
