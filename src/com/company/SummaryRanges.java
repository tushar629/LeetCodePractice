package com.company;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        int start =0,i=1;
        while(start < nums.length) {

            while (i < nums.length && nums[i] == nums[i-1]+1)
                i++;
            result.add(createInterval(nums[start],nums[i-1]));
       start = i++;
        }

        return result;
    }

    public String createInterval (int from , int to){

        if (from == to)
            return "" + from;
        String r = "";
        r = Integer.toString(from) + "->" + Integer.toString(to);
        return r;

    }

    public static void main(String[] args) {
        int a[] = new int[]{0,1,2,4,5,7};
        SummaryRanges obj = new SummaryRanges();
        System.out.println(obj.summaryRanges(a));
    }

}
