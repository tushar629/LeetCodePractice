package com.company;

import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
if(intervals==null){
    return null;
}
//        System.out.println(Arrays.deepToString(intervals));
//        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[0]));
//        System.out.println(Arrays.deepToString(intervals));
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0] ;j<= intervals[i][1];j++){
                set1.add(j);
            }
        }

        int[] num = new int[set1.size()];
        int l = 0;
        for (Integer val : set1) {
            num[l++] = val;
        }
        ArrayList<int[]> l1 = new ArrayList<int[]>();

        int start = num[0];
        for (int i = 1; i < num.length; ++i) {
            if (num[i] > num[i-1]+1) {
                l1.add(new int[]{start,num[i-1]});
//                outputInterval(start, num[i-1]);
                start = num[i];
            }
        }
        l1.add(new int[]{start, num[num.length-1]});

        int[][] finalAns = new int[l1.size()][];
        for(int i = 0; i < l1.size(); i++) {
            finalAns[i] = l1.get(i);
        }
        return finalAns;

    }

    public static void main(String[] args) {
        int [][]a = new int[][]{{1,3},{2,6},{1,4},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(a)));
    }

}
