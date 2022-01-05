package POTD;

public class BinaryArraySorting {
    static void binSort(int A[], int N)
    {
        int i=0,j=N-1;
        while(i<j){
            if(A[i]==1 && A[j]==0){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
            else if(A[i]==1) j--;
            else if(A[j]==0) i++;
            else {
                i++;
                j--;
            }

        }
    }
}
