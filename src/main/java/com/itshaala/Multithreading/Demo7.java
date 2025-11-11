package com.itshaala.Multithreading;

public class Demo7 {
    //    create the threads using runnable interface
    //step 01. create the Subclass of type runnable
     static class Worker implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);


            }
        }
    }

    public static void main(String[] args) {


    //step 02. create the subclass object
    Worker worker = new Worker();
    //worker.start(); //CTE

    //step 3 create the thread class object by passing runnable type object

    Thread thread = new Thread(worker, "worker");

    //step 4. call the start method

    thread.start();

    for (int i = 0; i < 10; i++) {
        System.out.println(Thread.currentThread().getName() + " " + i);
    }



}
}