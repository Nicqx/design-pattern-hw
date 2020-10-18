package com.company;

import java.util.Vector;

public class VectorAdapter extends Vector<Integer> {
    private Vector<Integer> vector;

    public VectorAdapter(Vector<Integer> vector) {
        this.vector = vector;
    }

    public Integer pop() {
        int result = vector.get(vector.size() - 1);
        vector.remove(vector.size() - 1);

        return result;
    }

    public void push(int element) {
        vector.add(element);
    }
}
