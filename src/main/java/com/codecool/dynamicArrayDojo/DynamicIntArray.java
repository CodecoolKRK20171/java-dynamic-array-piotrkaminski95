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

    public void add(int num) {
        this.arr = increaseArr();
        this.arr[this.arr.length - 1] = num;
    }

    private int[] increaseArr() {
        int[] newArr = new int[this.arr.length + 1];

        for (int i = 0; i < this.arr.length; i++ ) {
            newArr[i] = this.arr[i];
        }
        return newArr;
    }

    public void remove(int index) {}

    public void insert(int index, int num) {}

    @Override
    public String toString() { return arrToString(); }

    private String arrToString() {
        String toReturn = "";

        for (int n : this.arr) {
            toReturn = String.format("%s %s", toReturn, Integer.toString(n));
        }
        return toReturn;
    }
}
