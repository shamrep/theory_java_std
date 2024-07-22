package org.theory.collections_std;

import java.util.*;

public class ListExamples {
    public static void main(String[] args) {
        List<String> list;

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("z");
        arrayList.add("d");
        arrayList.add(2, "e");

        System.out.println("_____________ArrayList_____________");
        System.out.println(arrayList.get(3));
        System.out.println(arrayList);
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.getLast());
        System.out.println(arrayList.indexOf("b"));

        arrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        arrayList.sort((s1, s2) -> s1.compareTo(s2));
        arrayList.sort(String::compareTo);

        System.out.println(arrayList);

        System.out.println(arrayList.stream().count());

        Iterator<String> iterator = arrayList.iterator();
        ListIterator<String> arrayListIterator = arrayList.listIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
//            iterator.remove();
        }

        System.out.println(arrayList.stream().count());

        System.out.println("_____________LinkedList_____________");
        List<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("n");
        linkedList.add("b");
        linkedList.add("a");

        System.out.println(linkedList);

        ListIterator<String> linkedListIterator = linkedList.listIterator();

        if(linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.nextIndex());
            System.out.println(linkedListIterator.next());
            linkedListIterator.set("o");
            System.out.println(linkedList);
        }

        if(linkedListIterator.hasPrevious()) {
            System.out.println(linkedListIterator.previous());
            linkedListIterator.remove();
            linkedListIterator.add("added");
        }
        System.out.println(linkedList);
    }
}
