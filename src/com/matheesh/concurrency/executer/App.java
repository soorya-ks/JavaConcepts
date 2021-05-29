package com.matheesh.concurrency.executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String[] args){

        ExecutorService executor =  Executors.newFixedThreadPool(2);

        Runnable t1 = new Thread(new TaskProcessor("create"));

        Thread t2 = new Thread(new TaskProcessor("Update"));

        Thread t3 = new Thread(new TaskProcessor("Delete"));

        executor.execute(t1);
        executor.execute(t2);
        executor.execute(t3);

        /* executor object continues to expect threads to be passed, so we need to use shutdown() function to terminate the thread
        once it's done executing all threads*/
        executor.shutdown();

        System.out.println("Guess all threads started running");  // This line executes first because main thread is faster

    }
}

        /*
        Things to keep remember:
        >>Use "executor.shutdownNow()" method to kill all the threads instantly
        >>Use "while(!executor.isTerminated()){}" to keep the loop running until all the threads finish executing
        >>Use "executor.awaitTermination(20, TimeUnit.SECONDS(10))" to delay termination for some specified period of time
         */
