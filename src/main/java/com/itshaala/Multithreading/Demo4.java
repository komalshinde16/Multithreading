package com.itshaala.Multithreading;

public class Demo4 {
    public static void main(String[] args) {
        //ways to create threads in java
        // 02. by implementing runnable interface

        Runnable runnable = () -> System.out.println("who is executing the run method :"+ Thread.currentThread().getName());
        Thread thread = new Thread(runnable, "worker");
        thread.start();
        System.out.println("main method logic : " + Thread.currentThread().getName());
    }


}
