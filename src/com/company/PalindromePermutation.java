package com.company;

import java.util.HashMap;

public class PalindromePermutation {

    public static boolean canPermutePalindrome(String s) {

        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            if(hm.containsKey(s.charAt(i))){

                int oldValue = hm.get(s.charAt(i));
                hm.replace(s.charAt(i),oldValue+1);

            }else hm.put(s.charAt(i),1);

        }
        int ap = 0 ;
        for (char c1: hm.keySet()  ) {
            ap = ap + hm.get(c1) %2;

        }

        return ap<=1;
    }

    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("ffff"));
    }

}
