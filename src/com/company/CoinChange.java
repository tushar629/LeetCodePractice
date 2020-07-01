package com.company;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {

        if (amount == 0)
            return 0;

        Arrays.sort(coins);
//        System.out.println(Arrays.toString(coins));
        int n = coins.length;
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = coins[i];
            j = j - 1;
        }
//        System.out.println(Arrays.toString(b));
        int result = -1;
        int i = 0;
        int  sum = 0;
        List<Integer> list = Arrays.stream(b).boxed().collect(Collectors.toList());
        System.out.println(list);
        while(sum!=amount && list.size() > 0){

//            i=i+1;
//            sum = sum + (int)list.get(0);
            if(sum > amount){
                sum = sum - (int)list.get(0);
                list.remove(0);
//                System.out.println(list);
                i--;

            }
            if(sum < amount && list.size() > 0){
                sum = sum + (int)list.get(0);
                i++;
            }
            if(sum == amount) {
                result = i;
                break;
            }
//            System.out.println(sum);

        }
//        System.out.println(Arrays.toString(b));
        return result;
    }

    public static void main(String[] args) {
        int a[] = new int[]{186,419,83,408};
        CoinChange obj = new CoinChange();
        System.out.println(obj.coinChange(a,6249));


    }

}

