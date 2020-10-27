package com.company.adapter;

import java.util.LinkedList;

public class LinkedListAdapter extends LinkedList<Integer> implements AdapterInterface {
    private final LinkedList<Integer> linkedList;

    public LinkedListAdapter(LinkedList<Integer> linkedList) {
        this.linkedList = linkedList;
    }

    public Integer pop() {
        return linkedList.pop();
    }

    public void push(int element) {
        linkedList.push(element);
    }


}
