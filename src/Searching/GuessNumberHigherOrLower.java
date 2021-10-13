package Searching;

public class GuessNumberHigherOrLower {
    static int pick = 584829;
    static int guess(int n){
        return Integer.compare(pick, n);
    }
    public static int guessNumber(int n) {
        int start = 1,end = n;
        while(true){
            int mid1 = start + (end-start)/2;
            int mid2 = end - (end-start)/2;
            int res1 = guess(mid1);
            int res2 = guess(mid2);
            if(res1==0){
                return mid1;
            }
            if(res2==0){
                return mid2;
            }
            else if(res1==-1){
                end = mid1-1;
            }
            else if(res2==1){
                start = mid2+1;
            }
            else {
                start = mid1+1;
                end = mid2-1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("The correct pick is : "+guessNumber(600000));
    }
}
