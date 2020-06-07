package com.purustech.learning.abstraction;

public class OpticalMouse implements Mouse {
    @Override
    public void moveCursor() {
        System.out.println("Move the cursor using optical way");

    }

    @Override
    public void leftClick() {
        System.out.println("left click optical way");
    }

    @Override
    public void rightClick() {
        System.out.println("right click optical way");
    }
}
