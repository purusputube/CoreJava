package com.purustech.learning.threads;

public class SynchronizationExample implements Runnable{
    CounterUtility counterUtility;
    SynchronizationExample(CounterUtility counterUtility){
        this.counterUtility = counterUtility;
    }
    @Override
    public void run() {
         counterUtility.increaseCounter();
    }

    public static void main(String[] args) {
        CounterUtility counterUtility = new CounterUtility();
        SynchronizationExample SynchronizationExample1 = new SynchronizationExample(counterUtility);
        Thread thread1 = new Thread(SynchronizationExample1);

        SynchronizationExample SynchronizationExample2 = new SynchronizationExample(counterUtility);
        Thread thread2 = new Thread(SynchronizationExample2);

        SynchronizationExample SynchronizationExample3 = new SynchronizationExample(counterUtility);
        Thread thread3 = new Thread(SynchronizationExample3);

        SynchronizationExample SynchronizationExample4 = new SynchronizationExample(counterUtility);
        Thread thread4 = new Thread(SynchronizationExample4);

        SynchronizationExample SynchronizationExample5 = new SynchronizationExample(counterUtility);
        Thread thread5 = new Thread(SynchronizationExample5);

        SynchronizationExample SynchronizationExample6 = new SynchronizationExample(counterUtility);
        Thread thread6 = new Thread(SynchronizationExample6);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}

class CounterUtility {
    Integer counter = 0;

    public  void increaseCounter(){
            //
            //
            //
            synchronized (this) {
            counter = counter + 1;
            System.out.println("current value is " + counter + " in thread " + Thread.currentThread().getName());
            }
            //
            //

    }
}

