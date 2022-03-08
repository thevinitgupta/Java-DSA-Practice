package Contests.HackWithInfy;
import java.util.*;
public class FindSumOfAllNonIncreasingSubsequences {
    public static int sumOfValue(int N, List<Integer> A){
        int sum = 0;
        List<List<Integer>> res = findSubsequences(A);
        for(int i=0;i<N;i++){
            sum += A.get(i);
        }
        for(int i=0;i<res.size();i++){
            int curr = 1;
            List<Integer> curL = res.get(i);
            for(int j=0;j<curL.size();j++){
                curr *= curL.get(j);
            }
            sum += curr%1000000007;
        }

        return sum;
    }
    public static List<List<Integer>> findSubsequences(List<Integer> nums) {
        List<List<Integer>> res = new LinkedList<>();
        helper(new LinkedList<Integer>(), 0, nums, res);
        return res;
    }
    private static void helper(LinkedList<Integer> list, int index, List<Integer> nums, List<List<Integer>> res){
        if(list.size()>1) res.add(new LinkedList<Integer>(list));
        List<Integer> used = new ArrayList<>();
        for(int i = index; i<nums.size(); i++){
            if(list.size()==0 || nums.get(i)<=list.peekLast()){
                used.add(nums.get(i));
                list.add(nums.get(i));
                helper(list, i+1, nums, res);
                list.remove(list.size()-1);
            }
        }
    }
}
