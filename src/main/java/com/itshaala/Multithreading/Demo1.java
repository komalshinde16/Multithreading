package com.itshaala.Multithreading;

public class Demo1 {
    public static void main(String[] args) {
//        traditional way
        class RunnableImpl implements Runnable{
            @Override
            public void run() {
                System.out.println("run - traditional way");
            }
        }
        Runnable t1= new RunnableImpl();
        t1.run();

//        anonymous class way

        Runnable t2 = new Runnable(){
            @Override
            public void run() {
                System.out.println("run - anonymous class way");
            }
        };
        t2.run();

// lambda expression

        Runnable t3 = new Runnable(){
            @Override
            public void run() {
                System.out.println("run - lambda expresssion");
            }
        };
        t3.run();
    }
}
