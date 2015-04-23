package com.epam.blokhina.task1;

/**
 * Created by Yevheniia_Blokhina on 4/22/2015.
 */
public class Hat extends Base {
    private String marking;
    private int quantity;
    private String type;

    public Hat(String name, int price, int quantity, String marking, String type) {
        super(name, price, quantity);
        setMarking(marking);
        setType(type);
        setQuantity(quantity);
    }

    public Hat() {
    }

    public String getMarking() {
        return marking;
    }

    public void setMarking(String marking) {
        this.marking = marking;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity * 10;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
