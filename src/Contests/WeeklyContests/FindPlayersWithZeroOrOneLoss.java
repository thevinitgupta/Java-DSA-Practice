package Contests.WeeklyContests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindPlayersWithZeroOrOneLoss {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> win = new HashMap<>();
        HashMap<Integer, Integer> loss = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0;i<matches.length;i++){
            win.put(matches[i][0],win.getOrDefault(matches[i][0], 0)+1);
            loss.put(matches[i][1],loss.getOrDefault(matches[i][1], 0)+1);
            min = Math.min(min, Math.min(matches[i][0], matches[i][1]));
            max = Math.max(max, Math.max(matches[i][0], matches[i][1]));
        }
        List<Integer> winners = new ArrayList<>();
        List<Integer> loosers = new ArrayList<>();
        for(int i=min;i<=max;i++){
            int wins = win.getOrDefault(i,-1), losses = loss.getOrDefault(i,-1);
            if(wins!=-1 || losses!=-1){
                if(wins>=1 && losses==-1) winners.add(i);
                else if(losses==1) loosers.add(i);
            }
        }
        ans.add(winners);
        ans.add(loosers);
        return ans;
    }
}
