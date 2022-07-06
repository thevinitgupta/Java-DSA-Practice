package InterviewBit.Arrays;

import java.util.ArrayList;

public class MergeIntervals {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<>();
        for (int i = 0; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);

            if (interval.end < newInterval.start) {
                result.add(interval);
            }

            else if (newInterval.end < interval.start) {
                result.add(newInterval);
                result.addAll(intervals.subList(i, intervals.size()));
                return result;
            }

            else {
                int start = Math.min(newInterval.start, interval.start);
                int end = Math.max(newInterval.end, interval.end);
                newInterval.start = start;
                newInterval.end = end;
            }
        }

        result.add(newInterval);

        return result;

    }
}
