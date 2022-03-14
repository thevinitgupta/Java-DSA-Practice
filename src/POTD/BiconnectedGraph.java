package POTD;

public class BiconnectedGraph {
    static int biGraph(int[] arr, int n, int e) {

        int[] degree = new int[n];

        for(int i = 0; i < 2*e; i += 2) {

            degree[arr[i]]++;
            degree[arr[i+1]]++;
        }


        for(int i = 0; i < n; i++) {

            // System.out.println(degree[i]);
            if(degree[i] == 1 && n != 2)
                return 0;
        }

        return 1;
    }
}
