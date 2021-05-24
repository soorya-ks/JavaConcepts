package com.matheesh.concurrency;

public class SynchronizedApp {

    public static void main(String[] args){

        SynchronizedSupportClass caller = new SynchronizedSupportClass();
        Helper t1 = new Helper(caller);
        Helper t2 = new Helper(caller);

        t1.start();
        t2.start();

    }
}

class Helper extends Thread{

    SynchronizedSupportClass supportClass = null;
    public Helper(SynchronizedSupportClass supportClass){
        this.supportClass = supportClass;
    }
    public void run(){
        for(int i=0; i<100; i++) {
            System.out.println(supportClass.next() + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}