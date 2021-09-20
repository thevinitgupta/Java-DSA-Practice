package POTD;

import java.util.ArrayList;

public class FactorialsOfLargeNumbers
{
    public static ArrayList<Integer> factorial(int n){
        //code here
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        int carry = 0;
        if(n<=1) return num;
        for(int i=2;i<=n;i++){
            for(int j=0;j<num.size();j++){
                int prod = num.get(j)*i + carry;
                num.set(j,prod%10);
                carry = prod/10;
            }
            while(carry>0){
                num.add(carry%10);
                carry = carry/10;
            }
        }
        int i=0,j=num.size()-1;
        while(i<j){
            int temp = num.get(i);
            num.set(i,num.get(j));
            num.set(j,temp);
            i++;
            j--;
        }
        return num;
    }

    public static void main(String[] args) {
        ArrayList<Integer> fact = factorial(10);
        System.out.println("Factorial of 10 :");
        for (Integer integer : fact) {
            System.out.print(integer);
        }
    }
}
