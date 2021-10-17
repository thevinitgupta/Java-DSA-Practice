package Strings;

import java.util.HashMap;

public class FindUniqueBinaryString {
    public static String findDifferentBinaryString(String[] nums) {
        HashMap<String,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i], i);
        }
        int limit  = (int)Math.pow(2,n) - 1;
        for(int i = 0; i<=limit;i++){
            String search = convertToBinary(i,n);
            if(!map.containsKey(search)) return search;
        }
        return "";
    }
    public static String convertToBinary(int n, int len){
        StringBuilder str = new StringBuilder(len);
        str.append("0".repeat(Math.max(0, len)));
        if(n!=0){
            int p = len-1;
            while(n>0){
                String d = n%2+"";
                str.setCharAt(p,d.charAt(0));
                p--;
                n = n/2;
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String [] arr = {"111","011","000"};
        System.out.println(findDifferentBinaryString(arr));
    }
}
