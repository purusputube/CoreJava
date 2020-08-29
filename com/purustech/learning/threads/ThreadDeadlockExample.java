package com.purustech.learning.threads;

public class ThreadDeadlockExample {

    public static void main(String[] args) throws InterruptedException {
        Printer printer1 = new Printer("HP Printer");
        Printer printer2 = new Printer("Epson Printer");

        PrinterUser printerUser1 = new PrinterUser(printer1,printer2);
        printerUser1.setName("Santosh");

        PrinterUser printerUser2 = new PrinterUser(printer2, printer1);
        printerUser2.setName("Harish");

        printerUser1.start();
        Thread.sleep(5000);
        // printerUser1.join();
        printerUser2.start();
    }
}

class Printer{
    private String name;
    Printer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void print() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " printing paper using " + name);
        Thread.sleep(10000);
    }
}


class PrinterUser extends Thread {
    private Printer printer1;
    private Printer printer2;

    public PrinterUser(Printer p1, Printer p2){
        this.printer1 =p1;
        this.printer2 =p2;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " going to use " + printer1.getName());
        synchronized (printer1)
        {
             System.out.println(name + " is using " + printer1.getName() );
            try {
                printer1.print();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " going to use " + printer2.getName());
             synchronized (printer2) {
                System.out.println(name + " is using " + printer2.getName());
                 try {
                     printer2.print();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
            System.out.println(name + " has finished using " + printer2.getName() );
        }
        System.out.println(name + " has finished using " + printer1.getName());
        System.out.println(name + " finished execution.");
    }

}
