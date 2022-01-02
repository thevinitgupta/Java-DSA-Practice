package Contests.WeeklyContests;

import java.util.HashMap;

public class NumberOfLaserBeamsInABank {
    public int numberOfBeams(String[] bank) {
        HashMap<Integer,Integer> beams = new HashMap<>();
        int r = 0,m=bank.length;
        for(int i=0;i<m;i++){
            String row = bank[i];
            int b = 0;
            for(int j=0;j<row.length();j++){
                if(row.charAt(j)=='1') b++;
            }
            if(b>0) {
                beams.put(i,b);
                r++;
            }
        }
        if(r<=1) return 0;
        int count = 0;
        for(int i=0;i<m;i++){
            if(beams.containsKey(i)){
                for(int j=i+1;j<m;j++){
                    if(beams.containsKey(j)){
                        //System.out.println(i+", "+j);
                        int f = beams.get(i),s = beams.get(j);
                        //System.out.println(f+", "+s);
                        count += s*f;
                        break;
                    }
                }
            }

        }
        return count;
    }
}
