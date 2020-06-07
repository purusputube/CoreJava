package com.purustech.learning.abstraction;

abstract class Remote{
    public void switchOffLights(){
        System.out.println("switch off the room lights");
    }
    public abstract void increaseVolume();
}
