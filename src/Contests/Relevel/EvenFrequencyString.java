package Contests.Relevel;

import java.util.*;
import java.lang.*;
import java.io.*;

/*
* 3
3
bba
ab
acc
2
a
b
3
ab
b
a
* */
public class EvenFrequencyString {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            int n = Integer.parseInt(sc.nextLine());
            String [] arr = new String[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextLine();
            }
            System.out.println(getMax(arr,n));
        }
    }
    public static int getMax(String [] arr, int n){
        List<HashMap<String, Integer>> li  = new ArrayList<>();
        List<HashSet<String>> sets = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s = arr[i];
            List<String> cList = Arrays.asList(s.split(""));
            sets.add(new HashSet<>(cList));
            HashMap<String, Integer> map = new HashMap<>();
            for(int j=0;j<s.length();j++){
                map.put(s.charAt(j)+"",map.getOrDefault(s.charAt(j)+"",0)+1);
            }
            li.add(map);
        }
        /*
        * bba
ab
acc
*
* bbaab
* abacc X
* bbaacc
        * */
        String max = "";
        for(int i=0;i<n;i++){
            String prev = arr[i];
            boolean currString = true;
            for(int j=i+1;j<n;j++){
                HashSet<String> curr = new HashSet<>();
                List<String> cList = Arrays.asList(prev.split(""));
                sets.add(new HashSet<>(cList));
                curr.addAll(sets.get(i));
                curr.addAll(sets.get(j));
                HashMap<String, Integer> m1 = li.get(i);
                HashMap<String, Integer> m2 = li.get(j);
                boolean even = true;
                String [] cs = curr.toArray(new String[curr.size()]);
                for(int k=0;k<cs.length;k++){

                    if((m1.getOrDefault(cs[k],0)+m2.getOrDefault(cs[k],0))%2!=0) {
                        even = false;
                        break;
                    }
                }
                if(even && (arr[i]+arr[j]).length() >= max.length()) {

                    max = (arr[i] + arr[j]);
                }
            }
        }
        return max.length();
    }
}
