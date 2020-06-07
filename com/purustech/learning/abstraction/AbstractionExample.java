package com.purustech.learning.abstraction;

public class AbstractionExample {
    public static void main(String[] args) {
        Remote tvRemote = new TVRemote();
        tvRemote.increaseVolume();

        tvRemote.switchOffLights();

        Remote dthRemote = new DTHRemote();
        dthRemote.increaseVolume();

        dthRemote.switchOffLights();
    }
}





