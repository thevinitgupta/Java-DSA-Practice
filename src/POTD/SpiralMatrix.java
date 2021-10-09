package POTD;

/*
    m = mat.length, n = mat[0].length;
* { { 2, 5, 1, 7,   6, 13 },
*   { 4, 3, 9, 10, 12, 1  },
*   { 6, 8, 1, 17,  5, 2  },
*   { 0, 2, 3, 8,  23, 0  },
    { 3, 7, 1, 9,   8, 16 }
* }
* */
public class SpiralMatrix {
    static int findK(int [][]a, int m, int n, int c)
    {
        int i, k = 0, l = 0;
        int count = 0;


        while (k < m && l < n) {

            for (i = l; i < n; ++i) {
                count++;

                if (count == c)
                   return a[k][i];
            }
            k++;
            for (i = k; i < m; ++i) {
                count++;

                if (count == c)
                    return a[i][n - 1];
            }
            n--;

            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    count++;

                    if (count == c)

                        return a[m - 1][i];
                }
                m--;
            }

            /* check the first column from
                    the remaining columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    count++;

                    if (count == c)
                        return a[i][l];
                }
                l++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] mat = {{ 2, 5, 1, 7,   6, 13 },{ 4, 3, 9, 10, 12, 1  },{ 6, 8, 1, 17,  5, 2  },{ 0, 2, 3, 8,  23, 0  },{ 3, 7, 1, 9,   8, 16 }};
        int kth = findK(mat,5,6,30);
        System.out.println(kth);
    }
}
