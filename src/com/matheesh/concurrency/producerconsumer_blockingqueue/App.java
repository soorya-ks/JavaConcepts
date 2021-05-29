package com.matheesh.concurrency.producerconsumer_blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {

    public static void main(String[] args){

        /*
        BlockingQueue comes bundled with concurrent package
        It's thread safe and better to be used for shared resources
         */

        BlockingQueue<Integer> questionList = new ArrayBlockingQueue<>(5);

        Thread t1 = new Thread(new Producer(questionList));
        Thread t2 = new Thread(new Consumer(questionList));

        t1.start();
        t2.start();





    }
}
