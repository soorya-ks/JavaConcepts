package com.matheesh.concurrency;

public class TaskThreadRunnable implements Runnable{

    public void run(){
        for(int i = 0; i<100; i++){
            System.out.println(i + " " + Thread.currentThread().getName());
        }

    }
}
