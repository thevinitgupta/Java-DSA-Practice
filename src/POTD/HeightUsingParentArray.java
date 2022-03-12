package POTD;

public class HeightUsingParentArray {
    static int findHeight(int N, int arr[]){
        if (N <= 1) return N;
        int maxHeight = 1;
        for (int i = 0; i < N; i++) {
            int curr = i, currHeight = 1;
            while (arr[curr] != -1) {
                curr = arr[curr];
                currHeight++;
            }
            maxHeight = Math.max(maxHeight, currHeight);
        }
        return maxHeight;
    }
}
