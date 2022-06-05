package com.company;

import java.util.ArrayList;
import java.util.List;

public class Count_items_matching_a_rule_1773 {
    public static void main(String[] args) {
        List<List<String >> items=new ArrayList<>();
        List<String > list=new ArrayList<>();
        list.add("phone");
        list.add("blue");
        list.add("pixel");
        List<String > list1=new ArrayList<>();
        list1.add("computer");
        list1.add("silver");
        list1.add("lenovo");
        List<String > list2=new ArrayList<>();
        list2.add("phone");
        list2.add("gold");
        list2.add("iphone");

        items.add(list);
        items.add(list1);
        items.add(list2);

        String ruleKey="color";
        String ruleValue="silver";

        System.out.println(items);
        System.out.println(countMatches(items,ruleKey,ruleValue));

    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(List<String> list : items){
            if(list.get(0)==ruleValue && ruleKey=="type" ) count++;
            if(list.get(1)==ruleValue && ruleKey=="color") count++;
            if(list.get(2)==ruleValue && ruleKey=="name") count++;
        }
        return count;
    }
}
