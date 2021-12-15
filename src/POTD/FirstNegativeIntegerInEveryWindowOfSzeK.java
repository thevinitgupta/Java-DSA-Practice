package POTD;

public class FirstNegativeIntegerInEveryWindowOfSzeK {
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        int i=0,j=0,c=0;
        long [] res = new long[(N-K)+1];
        long curr = 0;
        while(j<N){
            if(curr==0 && A[j]<0) curr=A[j];
            if(j-i>=K-1){
                res[c]=curr;
                c++;
                i++;
                int l=i;
                curr=0;
                while(l<=j){
                    if(A[l]<0) {
                        curr=A[l];
                        break;
                    }
                    l++;
                }
            }
            j++;
        }
        return res;
    }
}
