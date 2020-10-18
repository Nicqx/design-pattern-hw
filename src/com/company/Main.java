package com.company;

import java.util.ArrayList;

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

    }
}
