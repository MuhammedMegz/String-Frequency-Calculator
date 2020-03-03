package com.company;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
           List<String> list = new ArrayList<>();
           list.add("abc");
           list.add("bcd");
           list.add("abc");
           list.add("bba");
           getFreuency(list);
    }

    public static void getFreuency(List<String> inList){
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for(String i : inList){
            if(treeMap.containsKey(i)){
                treeMap.replace(i, (treeMap.get(i)+1));
            }else {
                treeMap.put(i, 1);
            }
        }
        treeMap.forEach((key,value) -> System.out.println(key + "|" +value));

    }

}
