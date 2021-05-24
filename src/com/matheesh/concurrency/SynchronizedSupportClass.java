package com.matheesh.concurrency;

public class SynchronizedSupportClass {
    int value = 0;

//    public int next(){
//        synchronized (this) {
//            value++;
//            return value;
//        }
//    }

    // You can use any of these both ways to implement synchronized

    public synchronized int next(){
        synchronized (this) {
            value++;
            return value;
        }
    }




}
