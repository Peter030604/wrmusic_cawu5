package com.example.wrmusic_project;

import java.util.Vector;

public class Product {
    private String productName;
    private Integer productPrice;

    public static Vector<Product> products = new Vector<>();

    public Product(String productName, Integer productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        products.add(this);
    }

    public String getProductName() {
        return productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

}
