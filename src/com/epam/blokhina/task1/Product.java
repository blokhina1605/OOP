package com.epam.blokhina.task1;

/**
 * Created by Yevheniia_Blokhina on 4/22/2015.
 */
public abstract class Product {
    protected String name;
    protected int quantity;
    protected double price;
    private static double averPrice;
    private static int totalQuantity;


    Product(String name, double price, int quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
        totalQuantity++;
        averPrice +=price;
    }

    Product() {
        totalQuantity++;
        averPrice +=this.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Incorrect quantity fot product " + this.getName() + ". Default value: 1");
            this.quantity = 1;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Incorrect price fot product " + this.getName() + ". Default value: 1");
            this.price = 1;
        }
    }

    public double getTotalCost() {
        double cost = quantity * price;
        return cost;
    }

    public static void countAverPrice(){
        averPrice /= totalQuantity;
        System.out.println(averPrice);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name:'" + name + '\'' +
                ", quant: " + quantity +
                ", price: " + price +
                '}';
    }
}
