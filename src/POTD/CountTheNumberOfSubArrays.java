package POTD;

/*
* N = 4, L = 4, R = 13
A[] = {2, 3, 5, 8}
* */
public class CountTheNumberOfSubArrays {
    static long countSubarray(int N,int A[],long L,long R) {
        // code here
        long rCount = countSubLessEqual(A, N, R);
        long lCount = countSubLessEqual(A, N, L-1);

        return rCount - lCount;
    }
    static long countSubLessEqual(int arr[], int n, long x) {
        int left = 0, right = 0;
        long curr = 0;
        long count = 0;
        while (right < n) {
            curr += arr[right];
            while (left <= right && curr > x) {
                curr -= arr[left];
                left++;
            }
            count += (right - left + 1);
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        int [] a =  {2, 3, 5, 8};
        System.out.println(countSubarray(4,a,4,13));
    }
}
