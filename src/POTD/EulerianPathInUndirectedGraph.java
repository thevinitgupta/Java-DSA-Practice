package POTD;

public class EulerianPathInUndirectedGraph {
    static int eulerPath(int n, int arr[][]){
        int count = 0;
        for(int ar[]: arr){
            int sum = 0;
            for(int i: ar) sum += i;
            if(sum%2!=0) count++;
            if(count>2) return 0;
        }
        return 1-count%2;
    }
}
