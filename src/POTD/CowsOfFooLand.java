package POTD;

/*
*
* */
public class CowsOfFooLand {

    //Time Limit Exceeded
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

    //Accepted solution
    /*
    * long MOD = 1000000007L;
	public void fastFib(long n, long[] ans){
	    if(n == 0){
	        ans[0] = 0;
	        ans[1] = 1;
	        return;
	    }
	    fastFib((n/2), ans);
	    long a = ans[0];
	    long b = ans[1];
	    long c = 2*b - a;
	    if(c < 0)
	        c += MOD;
	    c = (a * c) % MOD;
	    long d = (a*a + b*b) % MOD;

	    if(n%2 == 0){
	        ans[0] = c;
	        ans[1] = d;
	    }else{
	        ans[0] = d;
	        ans[1] = c+d;
	    }
	}
	public int TotalAnimal(long N){
		long[] ans = new long[2];
		fastFib(N + 1, ans);
		return (int)ans[0];
	}
    * */

    public static void main(String[] args) {
        int totAnimals = TotalAnimal(Long.parseLong("100000"));
        System.out.println(totAnimals);
    }
}
