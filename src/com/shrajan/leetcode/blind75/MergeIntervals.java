package com.shrajan.leetcode.blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MergeIntervals {

    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> merged = new ArrayList<>();

        if (intervals == null || intervals.size() == 0) {
            return merged;
        }

        // Sort intervals based on the start point
        intervals.sort(Comparator.comparingInt(interval -> interval.start));

        merged.add(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            Interval last = merged.get(merged.size() - 1);

            // Check for overlap
            if (current.start <= last.end) {
                // Merge intervals
                last.end = Math.max(last.end, current.end);
            } else {
                // No overlap, add the current interval to the result
                merged.add(current);
            }
        }

        return merged;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>(Arrays.asList(
                new Interval(1, 3),
                new Interval(2, 6),
                new Interval(8, 10),
                new Interval(15, 18)
        ));

        List<Interval> result = merge(intervals);

        for (Interval interval : result) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}
