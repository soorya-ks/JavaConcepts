package com.matheesh.concurrency.producerconsumer_blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    BlockingQueue<Integer> questionList;
    private int questionNo;

    public Producer(BlockingQueue questionList){
        this.questionList = questionList;
    }

    @Override
    public void run() {

        synchronized (this) {
            while (true) {
                try {
                    System.out.println("Created question - " + questionNo);
                    questionList.put(questionNo++); //Use put() instead of add(). put() acts similar to wait() and notify()
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
