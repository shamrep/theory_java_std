package org.theory.collections_std;

import java.util.*;
import java.util.function.Consumer;

public class SetExamples {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        System.out.println("________HashSet________");
        boolean added = hashSet.add(null);
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains(null));
        System.out.println(hashSet.add("a"));
        System.out.println(hashSet.add("a"));
        System.out.println(hashSet.add("a"));
        hashSet.add("e");
        hashSet.add("r");
        hashSet.add("y");
        hashSet.add("q");
        hashSet.add("v");
        System.out.println(hashSet);
        System.out.println(hashSet.remove(null));
        System.out.println(hashSet);

        System.out.println("________LinkedHashSet________");
        System.out.println(linkedHashSet.add("l"));
        System.out.println(linkedHashSet.add("l"));
        System.out.println(linkedHashSet.add("e"));
        System.out.println(linkedHashSet.add("a"));

        System.out.println(linkedHashSet);
        linkedHashSet.stream().forEach(s -> System.out.println(s + "!"));
        linkedHashSet.stream().forEach(System.out::println);

        Iterator<String> linkedHashSetIterator = linkedHashSet.iterator();
        while (linkedHashSetIterator.hasNext()) {
            System.out.println(linkedHashSetIterator.next());
        }

        System.out.println("________TreeSet________");
        TreeSet<String> treeSet = new TreeSet<>(linkedHashSet);
        System.out.println(treeSet);
    }
}
