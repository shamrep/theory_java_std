package org.theory.collections_std;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("z");
        list.add("d");


        System.out.println(list.get(3));
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.indexOf("b"));

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        list.sort((s1, s2) -> s1.compareTo(s2));
        list.sort(String::compareTo);

        System.out.println(list);

        System.out.println(list.stream().count());

        Iterator<String> iterator = list.iterator();
        ListIterator<String> listIterator = list.listIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
//            iterator.remove();
        }

        System.out.println(list.stream().count());

//        listIterator.
    }
}
