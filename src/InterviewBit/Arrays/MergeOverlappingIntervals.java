package InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortIntervals implements Comparator<Interval> {
    public int compare(Interval a, Interval b){
        if(a.start==b.start){
            return a.end - b.end;
        }
        return a.start-b.start;
    }
}
class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
public class MergeOverlappingIntervals {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> res= new ArrayList<>();
        if(intervals.size()==0) return res;
        Collections.sort(intervals, new SortIntervals());
        res.add(intervals.get(0));
        for(int i=1;i<intervals.size();i++){
            Interval inter = intervals.get(i), resInter = res.get(res.size()-1);

            if(inter.start<=resInter.end){
                int min = Math.min(inter.start,resInter.start), max = Math.max(inter.end,resInter.end);
                res.set(res.size()-1, new Interval(min,max));
            }

            else {
                res.add(inter);
            }
        }
        return res;
    }
}
