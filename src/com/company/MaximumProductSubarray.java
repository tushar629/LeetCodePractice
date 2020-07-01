package com.company;

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums)

    {
        int l = nums.length;
        int result = nums[0];
        for (int i = 1; i < l ; i++) {

            nums[i] = Math.max(nums[i],nums[i-1]*nums[i]);
            result = Math.max(result,nums[i]);

        }
        return result;
    }

    public static void main(String[] args) {
        int a[] = new int[]{-2,3,-4};
        System.out.println(maxProduct(a));
    }
}
