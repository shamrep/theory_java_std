package org.theory.collections_std;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {
        System.out.println("_________Hashmap_________");
        Map<String, Long> hashMap = new HashMap<>();
        hashMap.put("one", 1L);
        hashMap.put("two", 2L);
        hashMap.put("one", 1L);

        System.out.println(hashMap);
        System.out.println(hashMap.get("one"));
        System.out.println(hashMap);
//        System.out.println(hashMap.);
        hashMap.remove("one");
        System.out.println(hashMap);

        System.out.println("________LinkedHashMap________");
        LinkedHashMap<String, Long> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("two", 2L);
        linkedHashMap.put("one", 1L);
        System.out.println(linkedHashMap);
    }
}
