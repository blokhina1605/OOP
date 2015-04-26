package com.epam.blokhina.task0_1.travelagency.deals.impl;

import com.epam.blokhina.task0_1.travelagency.deals.Country;
import com.epam.blokhina.task0_1.travelagency.deals.Shop;
import com.epam.blokhina.task0_1.travelagency.deals.Deal;
import com.epam.blokhina.task0_1.travelagency.deals.Transports;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Yevheniia_Blokhina on 4/22/2015.
 */
public class Shopping extends Deal {
    private List<Shop> shops;

    public Shopping(double price, boolean dining, Country destination, int nights, Transports transport, List<Shop> shops) {
        super(price, dining, destination, nights, transport);
        this.shops = shops;
    }
    @Override
    public String toString() {
        return "\n" + "Shopping {" +
                "Country: " + getDestination() +
                ", shops: " + shops.toString() +
                ", nights: " + getNights() +
                ", transport: " + getTransport() +
                ", dining: " + isDining() +
                ", price: " + getPrice() +
                "}";
    }

    @Override
    public DealType getType() {
        return DealType.SHOPPING;
    }
}
