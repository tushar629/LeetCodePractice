package com.company;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public int dp(int n1){
        int sum = 0;

        while( n1>0 ){
            int lastNumber = n1/10;
            int firstNumber = n1%10;
            sum = sum + (lastNumber * firstNumber);
        }
        System.out.println(sum);
        return sum;
    }


    public boolean isHappy(int n) {
        Set<Integer> setNumber = new HashSet<>();

        while(n!= 1 && !setNumber.contains(n)){
            setNumber.add(n);
            n = dp(n);
        }
        return n==1;
    }


    public static void main(String[] args) {
        HappyNumber obj1 = new HappyNumber();
        System.out.println(obj1.isHappy(19));
    }

}
