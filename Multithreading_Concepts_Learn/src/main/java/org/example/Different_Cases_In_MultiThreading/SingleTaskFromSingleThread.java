package org.example.Different_Cases_In_MultiThreading;

class MyThread extends Thread{
    public void run()
    {
        System.out.println("Running Thread");
    }
}
public class SingleTaskFromSingleThread {

    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
    }

}
