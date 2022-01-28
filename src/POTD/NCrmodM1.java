package POTD;

public class NCrmodM1 {
    private final long MOD = 1000003;
    private long[] factorial;

    private void computeFactorial() {
        factorial = new long[(int)MOD + 1];

        factorial[0] = 1;

        for (int i = 1; i <= MOD; ++i) {
            factorial[i] = ((factorial[i - 1] % MOD)  * i) % MOD;
        }
    }

    private long computePower(long a, long b) {
        long res = 1;

        while (b > 0) {
            if ((b & 1) > 0) {
                res = ((res % MOD) * (a % MOD)) % MOD;
                --b;
            }
            a = ((a % MOD) * (a % MOD)) % MOD;
            b /= 2;
        }

        return res;
    }

    private long computeModuloInverse(long a) {
        return computePower(a, MOD - 2);
    }

    private long computeNCR(long n, long r) {
        if (n < r) return 0;

        if (n == r) return 1;

        long value1 = factorial[(int)n];
        long value2 = computeModuloInverse(factorial[(int)r]);
        long value3 = computeModuloInverse(factorial[(int)(n - r)]);
        long product = ((value2 % MOD) * (value3 % MOD)) % MOD;
        long ans = ((value1 % MOD) * (product % MOD)) % MOD;
        return ans;
    }

    public int nCr(long n, long r) {
        // Code here
        computeFactorial();

        long p1 = MOD;
        long p2 = MOD * MOD;
        long[] a1 = new long[3];
        long[] a2 = new long[3];

        a1[2] = (n / p2);
        n %= p2;
        a1[1] = (n / p1);
        n %= p1;
        a1[0] = n;
        a2[2] = (r / p2);
        r %= p2;
        a2[1] = (r / p1);
        r %= p1;
        a2[0] = r;

        long value1 = computeNCR(a1[0], a2[0]);
        long value2 = computeNCR(a1[1], a2[1]);
        long value3 = computeNCR(a1[2], a2[2]);
        long product = ((value1 % MOD) * (value2 % MOD)) % MOD;
        long ans = ((value3 % MOD) * (product % MOD)) % MOD;

        return (int)ans;

    }
}
