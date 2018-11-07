package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {
    private int[] arr;

    public DynamicIntArray() {
        this.arr = new int[0];
    }

    public DynamicIntArray(int size) {
        this.arr = new int[size];
    }

    public void add(int num) {}

    public void remove(int index) {}

    public void insert(int index, int num) {}

    @Override
    public String toString() {
        String toReturn = "";

        for (int n : this.arr) {
            toReturn = String.format("%s%s", toReturn, Integer.toString(n));
        }

        return toReturn;
    }
}
