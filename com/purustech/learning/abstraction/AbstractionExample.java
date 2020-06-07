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

abstract class Remote{
    public void switchOffLights(){
        System.out.println("switch off the room lights");
    }
    public abstract void increaseVolume();
}

class TVRemote extends Remote {
    public void increaseVolume(){
        System.out.println("TV Volume increased");
    }

}

class DTHRemote extends Remote {
    public void increaseVolume(){
        System.out.println("DTH device level Volume increased");
    }

}

