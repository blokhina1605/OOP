package com.epam.blokhina.task1;

/**
 * Created by Yevheniia_Blokhina on 4/22/2015.
 */
public class Hat extends Product {
    private String marking;
    private int quantity;
    private String type;

    public Hat(String name, double price, int quantity, String type) {
        super(name, price, quantity);
        setType(type);
        setQuantity(quantity);
    }

    public Hat() {
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity ;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return name +"{" +
                "price:" + price +
                ", quant:" + quantity +
                ", type: '" + type + '\'' +
                '}';
    }
}
