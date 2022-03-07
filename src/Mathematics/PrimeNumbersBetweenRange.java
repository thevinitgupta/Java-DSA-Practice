package Mathematics;

import java.util.Scanner;

public class PrimeNumbersBetweenRange {
    static boolean isPrime[]  = new boolean[10000001];
    static int prev[] = new int[10000001];
    public static void setPrimes(){
        isPrime[0] = true;
        isPrime[1] = true;

        for(int i=2;i<isPrime.length;i++){
            if(isPrime[i]==false){
                for(int j=2;j*i<isPrime.length;j++){
                    isPrime[i*j] = true;
                }
            }
        }
    }
    public static void countPrimes(){
        prev[2] = 1;
        for(int i=3;i<isPrime.length;i++){
            prev[i] = prev[i-1];
            if(isPrime[i]==false){
                prev[i]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the left and right (both inclusive) range within which you want to find Count of Prime Numbers : ");
        System.out.print("Enter left : ");
        int l = sc.nextInt();
        System.out.print("Enter right : ");
        int r = sc.nextInt();
        int count = 0;
        if(r>1) {
            setPrimes();
            countPrimes();
            count = prev[r] - prev[l-1];
        }
        System.out.println("Total primes within range : "+count);
    }
}
