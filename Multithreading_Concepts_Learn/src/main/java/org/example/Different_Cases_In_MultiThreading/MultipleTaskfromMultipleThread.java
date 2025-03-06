package org.example.Different_Cases_In_MultiThreading;
class MyThread2 extends Thread{
    public void run()
    {
        System.out.println("Running Thread");
    }
}
public class MultipleTaskfromMultipleThread {

    public static void main(String[] args) {

        MyThread thread=new MyThread();
        thread.start();

        MyThread1 thread2=new MyThread1();
        thread2.start();

        MyThread2 myThread3=new MyThread2();
        myThread3.start();
    }
}
