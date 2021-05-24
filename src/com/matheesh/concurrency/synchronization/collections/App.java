package com.matheesh.concurrency.synchronization.collections;

public class App {

    /*
    created this app to show that ConcurrentModificationException will occur when we try to collections
    with two methods
     */

    public static void main(String[] args) throws InterruptedException {

        InventoryManager inventory = new InventoryManager();

        Thread t1 = new Thread(() -> inventory.populateSoldProducts());  // using lambda

      //Thread t1 = new Thread(inventory::populateSoldProducts);  // using method reference

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                inventory.displaySoldProducts();
            }
        });

        /*
         ConcurrentModificationException will occur when two threads try to access Collection
         To avoid it we've to make our methods synchronized or use concurrent collections
         */
        t1.start();
        Thread.sleep(1000);
        t2.start();

    }
}
