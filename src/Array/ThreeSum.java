package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

    //Time Limit Exceeded
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ts = new ArrayList<List<Integer>>();
//        for(int i=0;i<nums.length-2;i++){
//            for(int j=i+1;j<nums.length-1;j++){
//                int tar = - (nums[i]+nums[j]);
//                for(int k=j+1;k<nums.length;k++){
//                    if(tar==nums[k]){
//                        //System.out.println(nums[i]+" + "+nums[j]+" + "+nums[k]+" = 0");
//                        List<Integer> s = new ArrayList<Integer>();
//                        s.add(nums[i]);
//                        s.add(nums[j]);
//                        s.add(nums[k]);
//                        Collections.sort(s);
//                        boolean canAdd = true;
//                        for(int l=0;l<ts.size();l++){
//                            if(s.equals(ts.get(l))) {
//                                canAdd=false;
//                                break;
//                            }
//                        }
//                        if(canAdd) ts.add(s);
//                        break;
//                    }
//                }
//            }
//        }
//        return ts;
//    }



    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ts = threeSum(nums);
        System.out.println("Three Sum Combinations : ");
        System.out.println(ts);
    }
}
