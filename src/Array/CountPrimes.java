package Array;

public class CountPrimes {
    public static int countPrimes(int n) {
        int c = 0;
        if(n<=1) return 0;
        for(int i=2;i<n;i++){
            if(isPrime(i)) c++;
        }
        return c;
    }

    public static boolean isPrime(int n){
        for(int j =2;j<=Math.sqrt((double)n);j++){
            if(n%j==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = countPrimes(0);
        System.out.println("No. of Prime Nos. Less Than 10 : "+count);
    }
}
