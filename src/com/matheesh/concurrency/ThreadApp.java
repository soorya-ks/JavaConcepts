package com.matheesh.concurrency;

public class ThreadApp {

    public static void main(String[] args){

        System.out.println("Starting thread t1");
        TaskThread t1 = new TaskThread();               // Thread using Thread class
        t1.setName("t1");

        t1.start();

        System.out.println("Starting thread t2");
        TaskThread t2 = new TaskThread();
        t2.setName("t2");

        t2.start();

        System.out.println("Starting thread t3");
        TaskThreadRunnable task = new TaskThreadRunnable();  // Thread using Runnable interface
        Thread t3 = new Thread(task);
        t3.setName("t3");
        t3.start();

        System.out.println("starting thread t4");
        Thread t4 = new Thread(new Runnable(){
            public void run(){
                for(int i = 0; i<100; i++){
                    System.out.println(i + " " + Thread.currentThread().getName());
                }
            }
        });
        t4.setName("t4");
        t4.start();


    }
}

