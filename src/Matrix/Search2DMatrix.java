package Matrix;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length-1;i++){
            if(target>=matrix[i][0] && target<matrix[i+1][0]){
                if(binarySearch(matrix[i], target)) return true;
            }
        }
        return binarySearch(matrix[matrix.length-1],target);
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
