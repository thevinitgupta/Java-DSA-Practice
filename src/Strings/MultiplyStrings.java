package Strings;
import java.util.*;
public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        List<Integer> prod = new ArrayList<>();
        int i=num1.length()-1;
        int skip = 1;
        while(i>=0){
            int v1 = Integer.parseInt(num1.charAt(i)+"");
            int j=num2.length()-1;
            int carry =0,p = prod.size()-skip;
            while(j>=0){
                int v2 = Integer.parseInt(num2.charAt(j)+"");
                if(p<0) {
                    prod.add(0,0);
                    p=0;
                }
                int prev = prod.get(p);
                int currProd = v1*v2 + carry + prev;
                prod.set(p,(currProd%10));
                carry = (currProd - currProd%10)/10;
                p--;
                j--;
            }
            if(carry>0){
                prod.add(0,carry);
            }
            skip++;
            i--;
        }
        StringBuilder str = new StringBuilder();
        for (Integer integer : prod) {
            str.append(integer);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String prod = multiply("123","2456");
        System.out.println(prod);
    }
}
