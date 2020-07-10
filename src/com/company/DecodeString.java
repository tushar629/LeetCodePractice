package com.company;

import java.util.*;

public class DecodeString {


    public String decodeString(String s1) {
        Stack<Character> st1 = new Stack<>();
        String s =new StringBuilder(s1).reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a=='[' || a == ']')
                continue;
            else {
                st1.add(a);
            }
        }
        Iterator value = st1.iterator();
        String result = "";
        while (value.hasNext()) {
            String curr = value.next().toString();
            boolean isNumeric = curr.chars().allMatch( Character::isDigit );
            if (isNumeric){
                result = result.repeat(Integer.parseInt(curr));
            }
            else {
                result =  curr+  result ;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        DecodeString obj = new DecodeString();
        System.out.println(obj.decodeString("3[a]2[bc]"));

    }

}
