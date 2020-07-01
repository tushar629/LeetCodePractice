package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)
            return new ArrayList<>();

        HashMap<String,List> hm = new HashMap<>();

        for(String temp:strs){

            char[] c = temp.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);

            if(!hm.containsKey(key))
                hm.put(key,new ArrayList());

            hm.get(key).add(temp);
        }


        return new ArrayList(hm.values());
    }

    public static void main(String[] args) {
        GroupAnagram obj = new GroupAnagram();
        String a[] = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(obj.groupAnagrams(a));
    }
}
