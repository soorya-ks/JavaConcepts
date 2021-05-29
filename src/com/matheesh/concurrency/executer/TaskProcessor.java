package com.matheesh.concurrency.executer;

import java.util.Locale;

public class TaskProcessor implements Runnable{

    private String task;

    public TaskProcessor(String task){
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - received the request to execute " + task.toUpperCase(Locale.ENGLISH));
        performTask();
        System.out.println(Thread.currentThread().getName() + " - successfully completed " + task.toUpperCase(Locale.ROOT));

    }

    public void performTask(){
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
