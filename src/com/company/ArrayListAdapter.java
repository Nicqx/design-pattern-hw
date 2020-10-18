package com.company;

import java.util.ArrayList;

public class ArrayListAdapter extends ArrayList<Integer> {
    private ArrayList<Integer> arrayList;

    public ArrayListAdapter(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int pop() {
        int result = arrayList.get(arrayList.size() - 1);
        arrayList.remove(arrayList.size() - 1);
        return result;
    }

    public void push(int element) {
        arrayList.add(element);
    }
}
