package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BestTimetoBuyandSellStock {

    public static int maxProfit(int[] prices){
        int p = Integer.MAX_VALUE;
        int lowestrate = 0;
        for (int i = 0; i < prices.length; i++) {

            if(prices[i] < p){

                p = prices[i];

            }
            else if (prices[i] - p > lowestrate ){
                lowestrate = prices[i] - p;
            }

        }
        return lowestrate;
    }


    public static void main(String[] args) {
        int a[] = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(a));
    }
}
