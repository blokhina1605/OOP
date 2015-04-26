package com.epam.blokhina.task1;

import java.util.Arrays;

/**
 * Created by Yevheniia_Blokhina on 4/22/2015.
 */
public class Container {

    public static final int MAX_COUNT = 10;
    Product[] products;

    public Container() {
        this.products = new Product[0];
    }

    public Container(int maxItems) {
        if (maxItems < 1)
            maxItems = MAX_COUNT;
        this.products = new Product[maxItems];
    }

    public void add(Product f) {

        Product[] prod2 = new Product[products.length + 1];
        System.arraycopy(products, 0, prod2, 0, products.length);
        prod2[prod2.length - 1] = f;
        products = prod2;
    }

    public int count() {
        return products.length;
    }

    public Product getProduct(int index) {
        if (index > products.length) return null;
        Product product = products[index];
        return product;
    }

    public void remove(int index) {
        if (index > products.length) {
            return;
        }
        if (products[index] == null) {
            return;
        }
        for (int i = index; i < products.length; i++) {
            products[i - 1] = products[i];
        }
        products[products.length - 1] = null;
    }

    public void sortByPrice() {
        for (int i = products.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (products[j].getPrice() > products[j + 1].getPrice()) {
                    Product tmp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = tmp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Container{" + Arrays.toString(products) + '}';
    }
}
