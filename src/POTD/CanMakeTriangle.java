package POTD;

public class CanMakeTriangle {
    int[] canMakeTriangle(int A[], int N)
    {
        int c=0;
        if(N<3) return new int[0];
        int [] count = new int[N-2];
        for(int i=0;i+2<N;i++){
            count[c] = make(A[i],A[i+1],A[i+2]);
            c++;
        }
        return count;
    }
    public static int make(int a, int b, int c){
        int n = 0;
        if(a+b>c) n++;
        if(a+c>b) n++;
        if(b+c>a) n++;
        return n==3 ? 1 : 0;
    }
}
