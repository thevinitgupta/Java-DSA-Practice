package Array;

public class SumOfTwoNumbersWithoutPlus {
    static int sum(int a , int b)
    {
        while(b!=0){
            int carry = a&b;
            a = a^b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int sum = sum(16,16);
        System.out.println("sum="+sum);
    }
}
