package com.company.adapter;

import java.util.Vector;

public class VectorAdapter extends Vector<Integer> implements AdapterInterface {
    private final Vector<Integer> vector;

    public VectorAdapter(Vector<Integer> vector) {
        this.vector = vector;
    }

    public Integer pop() {

        return vector.remove(vector.size() - 1);
    }

    public void push(int element) {
        vector.add(element);
    }
}
