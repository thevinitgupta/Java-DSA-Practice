package POTD;

import java.util.HashMap;
import java.util.Map;

public class HitMostBalloons {
    public int getGCD(int a, int b)
    {
        if(b==0)
            return a;
        else return getGCD(b,a%b);
    }
    public int mostBalloons(int N, int arr[][]) {

        if (N <= 2) {
            return N;
        }
        int maxBalloons = 2;

        for (int i = 0; i < N; i++) {
            int horizontal = 0, vertical = 0, identical = 0;
            Map<String, Integer> slope = new HashMap<>();

            for (int j = 0; j < N; j++) {

                if (i != j) {
                    if (arr[i][0] == arr[j][0] && arr[i][1] == arr[j][1]) {
                        identical++;
                    } else if (arr[i][0] == arr[j][0]) {
                        vertical++;

                    } else if (arr[i][1] == arr[j][1]) {
                        horizontal++;
                    } else {
                        int ydiff = arr[i][1] - arr[j][1];
                        int xdiff = arr[i][0] - arr[j][0];
                        int gcd = getGCD(Math.abs(ydiff), Math.abs(xdiff));
                        ydiff /= gcd;
                        xdiff /= gcd;
                        if (xdiff < 0) {
                            xdiff *= -1;
                            ydiff *= -1;
                        }
                        // Hashing the pair
                        String g = xdiff+"-"+ydiff;
                        if (slope.containsKey(g)) {
                            int value = slope.get(g);
                            value++;
                            slope.put(g, value);

                        } else {
                            slope.put(g, 1);
                        }
                    }
                }
            }
            int mostPointsOnSameLine = 1;
            for (Map.Entry<String, Integer> item : slope.entrySet()) {
                mostPointsOnSameLine =
                        Math.max(mostPointsOnSameLine, item.getValue());
            }
            maxBalloons =
                    Math.max(maxBalloons, 1 + identical + mostPointsOnSameLine);
            maxBalloons = Math.max(
                    maxBalloons, 1 + identical + Math.max(horizontal, vertical));
        }

        return maxBalloons;
    }
}
