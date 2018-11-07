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
        this.arr = addToEndOfArr(num);
    }

    public void remove(int index) throws IndexOutOfBoundsException {
        boolean indexOutOfBound = index < 0 || index >= this.arr.length;

        if (indexOutOfBound) throw new ArrayIndexOutOfBoundsException();

        this.arr = decreaseArr(index);
    }

    private int[] decreaseArr(int dropIndex) {
        int[] newArr = new int[this.arr.length - 1];
        boolean dropedIndex = false;

        for (int i = 0; i < newArr.length; i++ ) {
            if (dropIndex == i) dropedIndex = true;

            if (dropedIndex)
                newArr[i] = this.arr[i + 1];
            else
                newArr[i] = this.arr[i];
        }
        return newArr;
    }

    public void insert(int index, int num) {
        boolean indexGreaterThanLength = index >= this.arr.length;
        boolean indexNegative = index < 0;

        if (indexGreaterThanLength) this.arr = this.addToEndOfArr(num);
        else {
            if (indexNegative) index = 0;
            this.arr = insertElem(index, num);
        }
    }

    private int[] insertElem(int index, int num) {
        boolean inserted = false;
        int[] newArr = new int[this.arr.length + 1];

        for (int i = 0; i < this.arr.length; i++ ) {
            if (index == i) {
                newArr[i] = num;
                inserted = true;
            }

            if (inserted)
                newArr[i + 1] = this.arr[i];
            else
                newArr[i] = this.arr[i];
        }
        return newArr;
    }

    private int[] addToEndOfArr(int num) {
        int[] newArr = new int[this.arr.length + 1];

        for (int i = 0; i < this.arr.length; i++ ) {
            newArr[i] = this.arr[i];
        }
        newArr[newArr.length - 1] = num;
        return newArr;
    }

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
