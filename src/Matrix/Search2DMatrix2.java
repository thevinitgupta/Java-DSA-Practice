package Matrix;

public class Search2DMatrix2 {
    public boolean searchMatrix2(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        int col = matrix[0].length-1;
        int row = 0;
        while(col >= 0 && row <= matrix.length-1) {
            if(target == matrix[row][col]) {
                return true;
            } else if(target < matrix[row][col]) {
                col--;
            } else if(target > matrix[row][col]) {
                row++;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        for(int i=0;i<m;i++){
            if(target>=matrix[i][0] && target<=matrix[i][n-1]){
                if(binarySearch(matrix[i],target)) return true;
            }
        }
        return false;
    }
    public static boolean binarySearch(int [] arr, int t){
        int low = 0, high = arr.length-1;
        //System.out.println(Arrays.toString());
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==t) return true;
            else if(t>arr[mid]) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}
