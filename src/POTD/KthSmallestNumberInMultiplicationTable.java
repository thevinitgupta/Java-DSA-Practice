package POTD;

public class KthSmallestNumberInMultiplicationTable {
    public static int getLowerNum(int m, int n, int target){
        int row = m - 1, col = 0;
        int res = 0;
        while(row >= 0 && col < n){
            if((row + 1) * (col + 1) > target) row--;
            else{
                res += row + 1;
                col++;
            }
        }
        return res;
    }
    public static int KthSmallest(int m, int n, int k) {
//Write your code here
        int low = 1, high = m * n;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int count = getLowerNum(m, n, mid);
            if(count < k) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int n = KthSmallest(7,6,14);
        System.out.println(n);
    }
}
