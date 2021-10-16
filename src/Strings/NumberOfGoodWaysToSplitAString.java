package Strings;
import java.util.*;
public class NumberOfGoodWaysToSplitAString {
    public static int numSplits(String s) {
        int good = 0,n = s.length();
        HashMap<Character,Integer> map =  new HashMap<>();
        int [] left = new int[n];
        int [] right = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)) {
                map.put(ch,1);
                count++;
            }
            left[i] = count;
        }
        map.clear();
        count=0;
        for(int i=n-1;i>=0;i--){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)) {
                map.put(ch,1);
                count++;
            }
            right[i] = count;
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        int i=0,j=1;
        while(i<n-1 && j<n){
            if( left[i]==right[j]) {
                System.out.println(left[i]+"  "+right[j]);
//                System.out.println(left[i+1]+""+right[i]);
                good++;
            }
            i++;j++;
        }
        return good;
    }

    public static void main(String[] args) {
        int splits = numSplits("aacaba");
        System.out.println(splits);
    }
}
