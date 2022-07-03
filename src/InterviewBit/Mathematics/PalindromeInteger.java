package InterviewBit.Mathematics;

public class PalindromeInteger {
    public int isPalindrome(int A) {
        if(A<0) return 0;
        int rev = 0,copy = A;
        while(A>0){
            rev = rev*10 + A%10;
            A/=10;
        }
        return copy==rev ? 1 : 0;
    }
}
