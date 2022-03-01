package Contests.Hacktag;

public class PlaceRedBlackCards {
    public static long place(long n, long black, long red){
        long c=1, cBlack = 0;
        long sum = black+red;
        c = n/sum;
        if(c==0) c=1;
        n -= sum*c;
        cBlack = c*black;
        if(n>0) cBlack+=n;
        return cBlack;
    }

    public static void main(String[] args) {
        System.out.println(place(9, 3, 4));
    }
}
