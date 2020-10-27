package com.company.adapter;

import java.util.ArrayList;

public class ArrayListAdapter extends ArrayList<Integer> implements AdapterInterface{
    private final ArrayList<Integer> arrayList;

    public ArrayListAdapter(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public Integer pop() {

        return arrayList.remove(arrayList.size() - 1);
    }

    public void push(int element) {
        arrayList.add(element);
    }
}
