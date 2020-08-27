package com.purustech.learning.threads;

public class ThreadExampleUsingThread {

    public static void main(String[] args) {
        System.out.println("In main thread");
        System.out.println(Thread.currentThread().getName());
        // using Thread class
        MyThread myThreadUsingThread  = new MyThread();
        myThreadUsingThread.setName("UsingThreadClass");
        myThreadUsingThread.setPriority(Thread.MIN_PRIORITY);
        myThreadUsingThread.start();
        // using Runnable Interface
        MyThreadRunnable myThreadUsingRunnable  = new MyThreadRunnable();
        //  myThreadUsingRunnable.run(); // this will cause the code to execute in the same main thread.
        Thread threadRunnable = new Thread(myThreadUsingRunnable);
        threadRunnable.setName("UsingRunnable");
        threadRunnable.setPriority(Thread.MAX_PRIORITY);
        threadRunnable.start();
    }
}

class MyThread extends Thread {
    public void run(){
        try {
            System.out.println("sleeping for 5s");
           // Thread.yield();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread running using Thread class");
        System.out.println(Thread.currentThread().getName());
    }
}


class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyThread running using runnable interface");
        System.out.println(Thread.currentThread().getName());
    }
}