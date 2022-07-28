package InterviewBit.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<A.size();i++){
            String sorted = sortString(A.get(i));
            ArrayList<Integer> curr = new ArrayList<>();
            if(map.containsKey(sorted)){
                curr = map.get(sorted);
            }
            curr.add(i+1);
            map.put(sorted,curr);
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(ArrayList<Integer> list : map.values()){
            ans.add(list);
        }
        return ans;
    }
    public static String sortString(String s){
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
