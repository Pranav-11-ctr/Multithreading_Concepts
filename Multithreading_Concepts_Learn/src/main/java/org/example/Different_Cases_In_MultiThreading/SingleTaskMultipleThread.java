package org.example.Different_Cases_In_MultiThreading;

class MyThread1 extends Thread{
    public void run()
    {
        System.out.println("Running Thread");
    }
}
public class SingleTaskMultipleThread {

    public static void main(String[] args) {
        MyThread1 thread1=new MyThread1();
        thread1.start();

        MyThread1 thread2=new MyThread1();
        thread2.start();

        MyThread1 thread3=new MyThread1();
        thread3.start();

        MyThread1 thread4=new MyThread1();
        thread4.start();

    }
}
