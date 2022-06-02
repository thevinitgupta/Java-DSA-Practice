package Contests.BiweeklyContests.Contest79;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SenderWithLargestWordCount {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> ml = new ArrayList<>();
        int max = 0;
        for(int i=0;i<messages.length;i++){
            int count = messages[i].split(" ").length;
            map.put(senders[i], map.getOrDefault(senders[i],0)+count);
            max = Math.max(max,map.get(senders[i]));
        }
        for(String key : map.keySet()){
            if(map.get(key)==max){
                ml.add(key);
            }
        }
        Collections.sort(ml);
        return ml.get(ml.size()-1);
    }
}
