package com.itshaala.Multithreading;

public class Demo6 {
    public static void main(String[] args) {
        class Worker extends Thread {
            @Override
            public void run() {
                for (int i = 0; i <=10 ; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);

                }
            }
        }
        Worker worker = new Worker();
        worker.setName("KOMAL");
//        worker.start();
        worker.run();


        for (int i = 0; i <=10 ; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }


}
