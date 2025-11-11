package com.itshaala.Multithreading;

public class Demo3 {
    public static void main(String[] args) {
//        ways to create threads in java
        class Worker extends Thread {
            @Override
            public void run() {
                System.out.println("run method implemented");
                System.out.println("who is executing the run method : " + Thread.currentThread().getName());
            }
        }
        Worker worker = new Worker();
        worker.setName("KOMAL");
        worker.start();

        System.out.println("main method logic : " + Thread.currentThread().getName());
    }
}
