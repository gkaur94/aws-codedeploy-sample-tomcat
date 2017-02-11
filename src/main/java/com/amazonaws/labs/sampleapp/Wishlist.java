package com.amazonaws.labs.sampleapp;

import java.util.ArrayList;
import java.util.List;

public class Wishlist {

    private final List<String> list = new ArrayList<>();
    private int size = 0;

    public void add(final String toAdd) {
        list.add(toAdd);
        size++;
    }

    public int getSize() {
        return size;
    }

    public List<String> getList() {
        return list;
    }
}
