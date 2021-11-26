package POTD;

public class MoneyDistributions {
        public long power(long a,long b , long mod){

            long ans = 1L;
            while(b>0){
                if((b&1)!=0 ){
                    ans = (ans*a)%mod;
                }
                a = (a*a)%mod;
                b>>=1;
            }
            return ans;
        }

        public int totalWays(int N, int K)
        {
            // Code here
            if(K>N) return 0;
            if(K==N) return 1;

            return nCr(N-1,K-1);
        }

        public int nCr(int N,int R){

            long res= 1L;
            //long deno=1L;
            if(R > N-R){
                R = N-R;
            }
            long mod =(long) 1e9+7;
            for(int i=0;i<R;i++){

                res = (res *(N-i))%mod;
                res= res*power(i+1 , mod-2 ,mod)%mod;

            }

            return (int)res;
        }
}
