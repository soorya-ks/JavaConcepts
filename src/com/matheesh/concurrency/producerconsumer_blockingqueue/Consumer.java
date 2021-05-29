package com.matheesh.concurrency.producerconsumer_blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    BlockingQueue<Integer> questionList;

    public Consumer(BlockingQueue<Integer> questionList){
        this.questionList = questionList;
    }

    @Override
    public void run() {

        while(true){
            try {
                Thread.sleep(2500);
                // Use take() instead of remove(). take() acts similar to wait() and notify()
                System.out.println("Answered question - " + questionList.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
