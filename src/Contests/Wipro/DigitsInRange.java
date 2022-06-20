package Contests.Wipro;

public class DigitsInRange {
    public static int findOccurences(int input1, int input2){
        int result = 0;

        int itr = input1, d=input1, n = input2;

        while (itr <= n)
        {

            if (itr % 10 == d)
                result++;

            if (itr != 0 && itr/10 == d)
            {

                result++;
                itr++;
            }

            else if (itr/10 == d-1)
                itr = itr + (10 - d);
            else
                itr = itr + 10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findOccurences(2,30));
    }
}
