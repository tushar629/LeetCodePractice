package com.company;

import java.util.Arrays;

public class ProductofArrayExceptSelf {


    public static int[] productExceptSelf(int[] nums) {

        int l = nums.length;
        int product  = 1;
        int result[] = new int[l];
        for (int i = 0; i < l; i++) {
            result[i] = 1;
        }

        for (int i = 1; i < l; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        for (int i = l-1; i >=0 ; i--) {
            result[i] = result[i] * product;
            product = product * nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int a[] = new int[]{1,0};
        System.out.println(Arrays.toString(productExceptSelf(a)));
    }

}
