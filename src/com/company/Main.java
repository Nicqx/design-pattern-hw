package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println("2. Adapter Task\n");
        System.out.println("2.1 Array List\n");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(9);
        arrayList.add(23);

        System.out.println("Original list:" + arrayList);

        ArrayListAdapter arrayListAdapter = new ArrayListAdapter(arrayList);

        System.out.println("Performing the pop(): " + arrayListAdapter.pop());
        System.out.println("List after the pop:" + arrayList);
        System.out.println("Performing the push() with an element 95");
        arrayListAdapter.push(95);
        System.out.println("List after the push: " + arrayList);

        System.out.println("--------------------\n");
        System.out.println("2.2 Linked List\n");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(9);
        linkedList.add(23);

        System.out.println("Original list:" + arrayList);

        LinkedListAdapter linkedListAdapter = new LinkedListAdapter(linkedList);

        System.out.println("Performing the pop(): " + linkedListAdapter.pop());
        System.out.println("List after the pop:" + linkedList);
        System.out.println("Performing the push() with an element 95");
        linkedListAdapter.push(95);
        System.out.println("List after the push: " + linkedList);

        System.out.println("--------------------\n");

    }
}
