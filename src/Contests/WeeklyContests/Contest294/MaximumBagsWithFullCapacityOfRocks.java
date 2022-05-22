package Contests.WeeklyContests.Contest294;

import java.util.Arrays;

public class MaximumBagsWithFullCapacityOfRocks {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        class Pair{
            int cap, curr;
            Pair(int c, int cu){
                this.cap = c;
                this.curr = cu;
            }
        }
        int n = capacity.length;
        Pair [] map = new Pair[n];
        for(int i=0;i<n;i++){
            map[i] = new Pair(capacity[i], rocks[i]);
        }

        Arrays.sort(map, (a, b) ->{
            int diff1 = a.cap-a.curr, diff2 = b.cap-b.curr;
            return diff1-diff2;
        });

        int pos = 0, count = 0;


        while(additionalRocks>0 && pos<n){
            int diff = map[pos].cap-map[pos].curr;
            if(diff==0){
                pos++;
                continue;
            }
            else if(diff <= additionalRocks){
                map[pos].curr = map[pos].cap;
                additionalRocks -= diff;
                pos++;
            }
            else break;
        }


        for(int i=0;i<n;i++){
            if(map[i].cap-map[i].curr==0) count++;
        }
        return count;
    }
}
