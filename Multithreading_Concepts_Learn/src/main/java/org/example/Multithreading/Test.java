package org.example.Multithreading;

//By extending Thread Class
//Internally Thread class implements Runnable interface only
//public class Test extends Thread{
//
//    public void run()
//    {
//        System.out.println("Thread Running");
//    }
//
//    public static void main(String[] args) {
//        Test test=new Test();
//        test.start();
//        test.start();//Once Thread is Dead we can reborn it , we have to Create again obejct of it
//    }
//}

public class Test implements Runnable
{

    @Override
    public void run() {
        System.out.println("Thread Running");
    }

    public static void main(String[] args) {
        Test t=new Test();
        //if we are not giving t as an argument in Thread Constructor it will not give us error only
        // it will not show any output because th.start(0 method acn not find run() method
        Thread th=new Thread(t);
        th.start();
    }
}
