package com.company;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {

        if(nums.length < 1) return 0;

        HashMap<Integer,Integer> hm = new HashMap();
        int count = 0 , sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            if (sum == k) count++;
            if (hm.containsKey(sum-k)){
                count = count + hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);

        }
        return count;
    }

    public static void main(String[] args) {

        int[] a = new int[]{1,2,1,2,1};
        SubarraySumEqualsK obj = new SubarraySumEqualsK();
        System.out.println(obj.subarraySum(a,3));
    }
}
