package POTD;

import java.util.*;

public class OverlappingIntervals {
    public static int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here
        int n = Intervals.length;
        if(n==1) return Intervals;
        List<List<Integer>> merged = new ArrayList<>();
        Intervals = sort(Intervals);
        int prev = 0,curr = 1,p=0,currMax = Intervals[prev][1];
        List<Integer> ele = new ArrayList<>();
        ele.add(Intervals[prev][0]);
        ele.add(Intervals[prev][1]);
        merged.add(ele);
        while(curr<n){
            if(Intervals[curr][0]<=merged.get(p).get(1)){
                if(Intervals[curr][1]>merged.get(p).get(1)){
                    merged.get(p).set(1,Intervals[curr][1]);
                }
            }

            else {
                List<Integer> l = new ArrayList<>();
                l.add(0,Intervals[curr][0]);
                l.add(1,Intervals[curr][1]);
                merged.add(l);
                p++;
            }
            curr++;
        }
        return convertToArray(merged);
    }
    public static int[][] sort(int [][] nums){
        if(nums.length<=1){
            return nums;
        }
        int mid = nums.length/2;
        int [][] left = Arrays.copyOfRange(nums,0,mid);
        int [][] right = Arrays.copyOfRange(nums,mid,nums.length);
        return merge(sort(left),sort(right));
    }
    public static int[][] merge(int [][] a,int [][] b){
        int i=0,j=0,k=0;
        int [][] merged = new int[a.length + b.length][2];
        while(i<a.length && j<b.length){
            if(a[i][0]<b[j][0]){
                merged[k] = a[i];
                i++;
            }
            else {
                merged[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<a.length){
            merged[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            merged[k] = b[j];
            j++;
            k++;
        }
        return merged;
    }
    public static int[][] convertToArray(List<List<Integer>> li){
        int m = li.size();
        int n = li.get(0).size();
        int [][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            int [] el = new int[n];
            for(int j=0;j<n;j++){
                el[j] = li.get(i).get(j);
            }
            arr[i] = el;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [][] arr = {{6,8},{1,9},{2,4},{4,7},{13,15},{11,14},{19,23}};
        arr = overlappedInterval(arr);
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
