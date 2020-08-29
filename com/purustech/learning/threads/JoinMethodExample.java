package com.purustech.learning.threads;

public class JoinMethodExample extends Thread{
 public void run(){
  System.out.println("Thread Name: " + Thread.currentThread().getName());
  for(int i=1;i<=5;i++){  
   try{  
    Thread.sleep(500);  
   }catch(Exception e){System.out.println(e);}  
  System.out.println(i + " " + Thread.currentThread().getName());
  }  
 }  
public static void main(String args[]) throws InterruptedException {
 JoinMethodExample t1=new JoinMethodExample();
 JoinMethodExample t2=new JoinMethodExample();

 t1.setName("JoinThread1");
 t2.setName("JoinThread2");
 t1.start();
 t1.join();
 System.out.println("statement after calling t1 start");
 t2.start();
 }
}  