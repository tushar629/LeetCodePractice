package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReorderDatainLogFiles {

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static String[] reorderLogFiles(String[] logs) {

        ArrayList<String> alDigit = new ArrayList<>();
        ArrayList<String> alLetter = new ArrayList<>();

        for (String st: logs){
            String cmp = st.split(" ")[1];
//            System.out.println(cmp);
            if(isNumeric(cmp)){
                alDigit.add(st);
//                System.out.println("digit lock "+st);
            }
            else {
                alLetter.add(st);
//                System.out.println("leter lock " + st);
            }
        }
//        System.out.println(alLetter);

        Collections.sort(alLetter, (o1, o2) -> {

            String s1 = o1.substring(o1.indexOf(" ")+1, o1.length());
            String s2 = o2.substring(o2.indexOf(" ")+1, o2.length());
            if(s1.compareTo(s2) == 0) {
                return (o1.split(" "))[0].compareTo((o2.split(" "))[0]);
            }
            return (s1.compareTo(s2));
        });

        alLetter.addAll(alDigit);

        return alLetter.toArray(new String[alLetter.size()]);


    }

    public static void main(String[] args) {
        String arr[] = new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        System.out.println(Arrays.deepToString(reorderLogFiles(arr)));
    }

}
