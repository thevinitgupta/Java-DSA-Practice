package POTD;
import java.util.*;
public class ShopInCandyStore {
    static ArrayList<Integer> candyStore(int c[],int N,int K){
        // code here
        int s1=0;
        int s2=0;
        int i=0,j=0;
        ArrayList<Integer>ans=new ArrayList<>();
        Arrays.sort(c);
        j=c.length-1;
        for(i=0;i<=j;i++){
            s1+=c[i];
            j-=K;
        }
        i=0;
        for(j=c.length-1;j>=i;j--){
            s2+=c[j];
            i+=K;
        }
        ans.add(s1);
        ans.add(s2);
        return ans;
    }

}
