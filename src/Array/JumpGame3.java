package Array;

public class JumpGame3 {
    public boolean canReach(int[] arr, int start) {
        if(start>=arr.length || start<0 || arr[start]<0) return false;
        if(arr[start]==0) return true;
        //System.out.println(Arrays.toString(arr));
        int leftJump = start-arr[start];
        int rightJump = start+arr[start];

        arr[start]=-1;
        return canReach(arr,leftJump) || canReach(arr,rightJump);
    }
}
