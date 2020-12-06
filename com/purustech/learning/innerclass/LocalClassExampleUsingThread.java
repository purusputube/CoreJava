package com.purustech.learning.innerclass;

import java.util.ArrayList;
import java.util.List;

public class LocalClassExampleUsingThread {
    public static void main(String[] args) {
        LocalClassExampleUsingThread localClassExampleUsingThread = new LocalClassExampleUsingThread();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        localClassExampleUsingThread.processData(integerList);
    }

    public void processData(List<Integer> integerList){
        new Thread() {
            public void run(){
                for(Integer value:integerList){
                    System.out.println( " Value is : " + value);
                }
            }
        }.start();
    }

}

