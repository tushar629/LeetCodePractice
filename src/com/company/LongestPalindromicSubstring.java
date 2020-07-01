
package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

    public class LongestPalindromicSubstring {
        public static HashMap<String,String> hm = new HashMap<>();

        public static void SubString(String str, int n) {
            String a = null;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    a = str.substring(i, j);
                    String reverse = new StringBuffer(a).reverse().toString();
                    hm.put(a, reverse);
                    a=null;
                }
            }
        }

        public static String longestPalindrome(String s) {
            HashMap<String,Integer> hm1 = new HashMap<>();

            SubString(s, s.length());
            Iterator hmIterator = hm.entrySet().iterator();
            String a1;
            String a2;
            while (hmIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry) hmIterator.next();
                a1 = (String) mapElement.getValue();
                a2 = (String) mapElement.getKey();
                if (a1.equals(a2)) {
                    hm1.put(a1, a1.length());
                }
            }
            hmIterator = null;
            int lengthOfPalindrome = 0;
            String resultPalindrome = null;
            Iterator hmIterator1 = hm1.entrySet().iterator();
            while (hmIterator1.hasNext()) {
                Map.Entry mapElement1 = (Map.Entry) hmIterator1.next();
                if((int)mapElement1.getValue() > lengthOfPalindrome){
                    lengthOfPalindrome = (int)mapElement1.getValue();
                    resultPalindrome = (String)mapElement1.getKey();
                }

            }
            hmIterator1 = null;
            return resultPalindrome;
        }

        public static void main(String[] args) {
            System.out.println(longestPalindrome("cbbd"));
        }


    }
