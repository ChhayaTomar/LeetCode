package com.company.medium;

import java.util.*;

public class Group_anagrams_49 {
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list= groupAnagrams(strs);
        System.out.println(list);

    }
    public static  List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<List<String>>();
        HashMap<String , List<String>> hmap=new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            String s= new String(c);
            if(hmap.containsKey(s)){
                List<String> list2=hmap.get(s);
                list2.add(strs[i]);
                hmap.put(s,list2);
            }else{
                List<String> list2=new ArrayList<>();
                list2.add(strs[i]);
                hmap.put(s,list2);
            }
        }
        for(Map.Entry<String , List<String>> entry : hmap.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }
}
