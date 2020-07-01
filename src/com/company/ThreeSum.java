package com.company;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> resultTriplets = new HashSet<>();

        for (int l = 0 ; l < n-2; l++){
            int m = l+1;
            int r = n-1;

            while(m<r /* till midle is smaller than right*/){
                int sum = nums[l] + nums[m] + nums[r] ;
                if(sum==0){
                    List<Integer> soln = Arrays.asList(nums[l] , nums[m] , nums[r] );
                    resultTriplets.add(soln);
                    m++;

                }
                if (sum > 0){
                    r--;
                }
                if (sum < 0){
                    m++;
                }

            }

        }

        return new ArrayList<>(resultTriplets);
    }

    public static void main(String[] args) {
        int[] a;
        a = new int[]{-1,0,1,2,-1,4};
        System.out.println(threeSum(a));

    }
}
