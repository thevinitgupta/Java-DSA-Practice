package AdityaVermaDP;

public class CountNumberOfSubsetsWithGivenSum {
    static int findNoOfSubsets(int[] A, int N, int i, int sum, int count) {
        // First, we initialize the matrix
        int matrix[][] = new int[N + 1][sum + 1];

        // To initialize the first value of the matrix
        matrix[0][0] = 1;
        for (int k = 1; k <= sum; k++) {
            matrix[0][k] = 0;
        }

        for (int k = 1; k <= N; k++) {
            matrix[k][0] = 1;
        }

        for (int k = 1; k <= N; k++) {
            for (int l = 1; l <= sum; l++) {

                // If element value is greater than the sum value
                if (A[k - 1] > l)
                    matrix[k][l] = matrix[k - 1][l];
                else {
                    matrix[k][l] = matrix[k - 1][l] +
                            matrix[k - 1][l - A[k - 1]];
                }
            }
        }

        return matrix[N][sum];
    }
}
