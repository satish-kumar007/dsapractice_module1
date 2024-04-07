package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapReality {
    public static void main(String[] args) {
        Map<String,Integer> hashmap = new HashMap<>();
        hashmap.put("Satish",1001);
        hashmap.put("Vihaan",1002);
        hashmap.put("Vaana",1003);
        System.out.println(hashmap);
        System.out.println("==========================================================");
        Map<String,Integer> linkedHashmap = new LinkedHashMap<>();
        linkedHashmap.put("Satish",1001);
        linkedHashmap.put("Vihaan",1002);
        linkedHashmap.put("Vaana",1003);
        System.out.println(linkedHashmap);
        System.out.println("==========================================================");
        Map<String,Integer> treemap = new TreeMap<>();
        treemap.put("Satish",1001);
        treemap.put("Vihaan",1002);
        treemap.put("Vaana",1003);
        System.out.println(treemap);
        System.out.println("==========================================================");
    }
}
