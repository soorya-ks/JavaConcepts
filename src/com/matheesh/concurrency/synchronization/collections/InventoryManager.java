package com.matheesh.concurrency.synchronization.collections;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

    List<Product> soldProducts = new ArrayList<>();

    public void populateSoldProducts() {

        for(int i=0; i<500; i++) {
            Product product = new Product(i, "product_id - " + (i + 1000));
            soldProducts.add(product);
            System.out.println("Added " + product.prodName);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void displaySoldProducts() {
        System.out.println("Displaying sold products...");
        for(Product product : soldProducts){
            System.out.println("Products sold - " + product.prodName);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
