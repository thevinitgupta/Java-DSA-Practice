package NQT;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int [] arr = {1,4,2,3,};
        System.out.println(getsoil(arr));
    }
    public static int getsoil(int [] arr){
        int tot = 0;
        for(int i=0;i<arr.length;i++){
            tot += i+1;
        }
        Arrays.sort(arr);
        int max = 0,j=0;
        while(j<arr.length && tot>0){
            tot -= arr[j];
            max++;
            j++;
        }
        if(tot<0) max--;
        return max;
    }
}
