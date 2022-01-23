package com.company;

public enum Size {

    SMALL(1), LARGE(2), HUGE(3);

    Size(int size) {
        this.size = size;
    }
    private int size;

    public int getSize() {
        return size;
    }
}
