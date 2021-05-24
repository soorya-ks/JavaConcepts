package com.matheesh.concurrency.synchronization.collections;

public class Product {

    int prodId;
    String prodName;

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                '}';
    }

    public Product(int prodId, String prodName) {
        this.prodId = prodId;
        this.prodName = prodName;
    }


}
