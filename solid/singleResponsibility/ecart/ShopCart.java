package singleResponsibility.ecart;

import java.util.ArrayList;

public class ShopCart {
    // this class is related to products with 1..* has a relationship
    private ArrayList<Products> productsList = new ArrayList<Products>();

    public void addProduct(Products product) {
        productsList.add(product);
    }

    public ArrayList<Products> getProducts() {
        return productsList;
    }

    double calculatePrice() {
        double total = 0;
        for (Products p : productsList) {
            total += p.price;
        }
        return total;
    }

}
