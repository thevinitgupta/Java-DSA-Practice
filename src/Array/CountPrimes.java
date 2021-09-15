package Array;

public class CountPrimes {
//    public static int countPrimes(int n) {
//        int c = 0;
//        if(n<=1) return 0;
//        for(int i=2;i<n;i++){
//            if(isPrime(i)) c++;
//        }
//        return c;
//    }

    public static int countPrimes(int n){
        if(n<=1) return 0;
        boolean [] primes = new boolean[n];
        for(int i=0;i<n;i++){
            primes[i] = true;
        }
        primes[0] = false;
        primes[1] = false;
        for(int i=2;i<n;i++){
            if(primes[i]){
                for(int j=2;i*j<n;j++){
                    primes[i*j]  = false;
                }
            }
        }
        int c = 0;
        for(int i=0;i<n;i++){
            if(primes[i]) c++;
        }
        return  c;
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
        int count = countPrimes(100);
        System.out.println("No. of Prime Nos. Less Than 10 : "+count);
    }
}
