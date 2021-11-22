package POTD;

public class MinimumNumberOfJumps {
    static int minJumps(int[] arr){
        // your code here
        int n = arr.length;
        if(n == 1){
            return 0;
        }
        if(arr[0] == 0){
            return -1;
        }

        int ladder = arr[0];
        int steps = arr[0];
        int jumps = 1;
        for(int i = 1; i < n - 1; i++){
            if(arr[i] + i > ladder){
                ladder = arr[i] + i;
            }

            steps--;
            if(steps == 0){
                steps = ladder - i;
                jumps++;
            }
            if(steps == 0){
                return -1;
            }
        }
        return jumps;
    }
}
