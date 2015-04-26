package com.epam.blokhina.task0_1.travelagency.deals;

import com.epam.blokhina.task0_1.travelagency.deals.impl.DealType;

/**
 * Created by Yevheniia_Blokhina on 4/22/2015.
 */
public abstract class Deal {
    private double price;
    private boolean dining = false;
    private Country destination;
    private int nights;
    private Transports transport;

    public Deal() {
    }

    public Deal(double price, boolean dining, Country destination, int nights, Transports transport) {
       setPrice(price);
        setDining(dining);
        setDestination(destination);
        setNights(nights);
        setTransport(transport);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public boolean isDining() {
        return dining;
    }

    public void setDining(boolean dining) {
        this.dining = dining;
    }

    public Country getDestination() {
        return destination;
    }

    public void setDestination(Country destination) {
        this.destination = destination;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        if (nights > 0) {
            this.nights = nights;
        }
    }

    public Transports getTransport() {
        return transport;
    }

    public void setTransport(Transports transport) {
        this.transport = transport;
    }


    public abstract DealType getType();

}
