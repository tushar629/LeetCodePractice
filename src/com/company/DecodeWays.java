package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class DecodeWays {
    public int numDecodings(String s) {
//        HashMap<Integer,String > integerStringHashMap = new HashMap<>(26);
//        for (int i = 1; i <= 26; i++) {
//            integerStringHashMap.put(i,Character.toString((char) i+64));
//        }
//        System.out.println(integerStringHashMap);
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }
        char[] cs = s.toCharArray();
        int[] f = new int[cs.length];
        f[0] =  1;
        for (int i = 1  ; i < cs.length; i++) {
            int x = Integer.parseInt(String.valueOf(cs[i-1]));//previous digit
            int y = Integer.parseInt(String.valueOf(cs[i]));//current digit
            int xy = x*10+y; //two digit at same time
            if(1<= y && y<=9){ //between 1 and 9
                f[i] = f[i-1];
            }
            if(10<=xy && xy<=26){

                f[i] = i == 1 ? (f[i] + 1) : (f[i] + f[i-2]);


            }

        }

        return f[f.length-1];
    }

    public static void main(String[] args) {
        DecodeWays obj = new DecodeWays();
        System.out.println(obj.numDecodings("226"));
    }
}
