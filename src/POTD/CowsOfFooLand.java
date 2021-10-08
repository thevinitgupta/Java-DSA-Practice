package POTD;

/*
*
* */
public class CowsOfFooLand {
    public static int  TotalAnimal(long N)
    {
        // code here
        if(N<=2) return (int)N;
        long a =1,b = 2, count = 2;
        long offSprings = 0;
        long M = 1000000007;
        while(count<=N){
            System.out.println("a :"+a);
            System.out.println("b :"+b);
            offSprings = ((a%M) + (b%M)) %M;
            a = b;
            b = offSprings;
            count++;
        }
        return (int) offSprings;
    }

    public static void main(String[] args) {
        int totAnimals = TotalAnimal(Long.parseLong("100000"));
        System.out.println(totAnimals);
    }
}
