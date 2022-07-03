package InterviewBit.Strings;

import java.util.HashMap;

public class AddBinaryStrings {
    public String addBinary(String A, String B) {
        StringBuilder ans = new StringBuilder();
        int carry = 0, i = A.length()-1, j = B.length()-1;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(2,10);
        map.put(3,11);
        while(i>=0 || j>=0){
            int v1 = i>=0 && A.charAt(i)=='1' ? 1 : 0;
            int v2 = j>=0 && B.charAt(j)=='1' ? 1 : 0;
            int sum = map.get(v1+v2+carry);
            ans.insert(0,sum%10);
            carry = sum/10;
            i--;
            j--;
        }
        if(carry>0){
            ans.insert(0,carry);
        }
        return ans.toString();
    }
}
