package Strings;
import java.util.*;
public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int j=0;
        int sum = 0;
        while(j<s.length()){
            int val=0;
            char curr = s.charAt(j);
            int cVal = map.get(curr);
            if(j+1<s.length()) {
                char next = s.charAt(j+1);
                int nVal = map.get(next);
                if(cVal<nVal){
                    val = nVal - cVal;
                    j++;
                }
                else val = cVal;
            }
            else val = cVal;
            sum += val;
            j++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int intEquiv = romanToInt("CMIV");
        System.out.println(intEquiv);
    }
}
