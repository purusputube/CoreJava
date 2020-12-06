package com.purustech.learning.innerclass;

import java.util.List;

class DataProcessor implements Runnable {
    List<Integer> integerList;
    DataProcessor(List<Integer> integerList){
        this.integerList = integerList;
    }
    public void run(){
        processData();
    }
    private void processData(){
        for(Integer value:integerList){
            System.out.println( " Value is : " + value);
        }
    }
}