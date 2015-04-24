package com.epam.blokhina.task1;

/**
 * Created by Yevheniia_Blokhina on 4/22/2015.
 */
public class Footwear extends Product {
    private String color;
    private int size;

    public Footwear() {
    }

    public Footwear(String name, int price, int quantity, String color, int size) {
        super(name, price, quantity);
        setColor(color);
        setSize(size);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size <= 15) {
            System.out.println("Incorrect size. Default value: 16");
        } else {
            this.size = size;
        }
    }
}
