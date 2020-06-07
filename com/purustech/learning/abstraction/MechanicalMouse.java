package com.purustech.learning.abstraction;

public class MechanicalMouse implements Mouse {
    @Override
    public void moveCursor() {
        System.out.println("Move the cursor using mechanical way");
    }

    @Override
    public void leftClick() {
        System.out.println("do left click mechanical way");
    }

    @Override
    public void rightClick() {
        System.out.println("do right click mechanical way");
    }
}
