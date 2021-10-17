package POTD;
import java.util.*;
public class MinimumOperationsToConvertArrayAtoB {
    static int lisInNLogN(ArrayList<Integer> al) {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for(int i=0; i<al.size(); i++) {
            if(ans.isEmpty()) {
                ans.add(al.get(i));
                continue;
            }

            int index = Collections.binarySearch(ans, al.get(i));

            if(index < 0) {
                index *= -1;
                index--;
                if(index >= ans.size()) ans.add(al.get(i));
                else {
                    ans.set(index, al.get(i));
                }
            }
        }

        return ans.size();
    }

    static int minInsAndDel(int[] A, int[] B, int N, int M) {
        //make a common array
        //find lis in nlogn
        //once lis is calcuated do N+M-2*lis

        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<N;i++) {
            if(Arrays.binarySearch(B, A[i]) >= 0) al.add(A[i]);
        }

        int lis = lisInNLogN(al);

        return N+M-2*lis;
    }

    public static void main(String[] args) {
        int []a = {1, 2, 5, 3, 1};
        int []b = {1,3,5};
        int ops = minInsAndDel(a,b,5,3);
        System.out.println(ops);
    }
}
