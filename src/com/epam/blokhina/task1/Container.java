package com.epam.blokhina.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yevheniia_Blokhina on 4/22/2015.
 */
public class Container implements Comparable {

    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Container(List<Product> products) {
        setProducts(products);
    }

    public Container() {
        List<Product> products = new ArrayList<>();
        setProducts(products);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public void add(Product product) {
        products.add(product);
    }

    public int count() {
        return products.size();
    }

    public int countAll() {
        int count = 0;
        for (Product product : products) {
            count +=product.getQuantity();
        }
        return count;
    }
    public Product getProduct(int index){
        return products.get(index);
    }





}
