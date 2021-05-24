package com.matheesh.concurrency;

public class TaskThread extends Thread {

    public void run(){

        for(int i = 0; i<100; i++){
            System.out.println(i + " " + this.getName());
        }

    }
}
