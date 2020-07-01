package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> s1 = new HashSet<>();
        int result = 0,i=0,j=0;

        while (i< s.length() && j < s.length()){
            if(!s1.contains(s.charAt(j))){
                s1.add(s.charAt(j++));
                result = Math.max(result,j-i);
            }
            else {
                s1.remove(s.charAt(i++));
            }

        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));

    }

}
