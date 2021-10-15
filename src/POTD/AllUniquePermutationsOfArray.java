package POTD;
import java.util.*;
public class AllUniquePermutationsOfArray {
    static HashSet<ArrayList<Integer>> set;
    static ArrayList<ArrayList<Integer>> result;

    static void solve(ArrayList<Integer> arr, ArrayList<Integer> res){
        if(arr.size() == 0){
            if(set.add(res))  result.add(new ArrayList<>(res));
            return;
        }
        for(int i=0; i<arr.size(); i++){
            int val = arr.get(i);
            arr.remove(i);
            res.add(val);

            solve(arr,res);

            arr.add(i,val);
            res.remove(res.size()-1);
        }
    }

    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        Collections.sort(arr);
        set = new HashSet<>();
        result = new ArrayList<>();
        solve(arr,new ArrayList<>());

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        ArrayList<ArrayList<Integer>> perms = uniquePerms(nums,3);

        System.out.println(perms);
    }
}
