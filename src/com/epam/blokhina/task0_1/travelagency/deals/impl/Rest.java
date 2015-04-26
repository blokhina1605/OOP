package com.epam.blokhina.task0_1.travelagency.deals.impl;

import com.epam.blokhina.task0_1.travelagency.deals.Country;
import com.epam.blokhina.task0_1.travelagency.deals.Deal;
import com.epam.blokhina.task0_1.travelagency.deals.Transports;

/**
 * Created by Yevheniia_Blokhina on 4/22/2015.
 */
public class Rest extends Deal {

    private String hotelName;
    private int quantityOfDining;

    public Rest(double price, boolean dining, Country destination, int nights, Transports transport, String hotelName, int quantityOfDining) {
        super(price, dining, destination, nights, transport);
        this.hotelName = hotelName;
        this.quantityOfDining = quantityOfDining;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getQuantityOfDining() {
        return quantityOfDining;
    }

    public void setQuantityOfDining(int quantityOfDining) {
        if (isDining() && quantityOfDining > 0) {
            this.quantityOfDining = quantityOfDining;
        } else this.quantityOfDining = 0;
    }

    @Override
    public String toString() {
        return "\n" + "Rest {" +
                "Hotel: '" + hotelName + '\'' +
                ", dining: " + isDining() +
                ", quantity of dining: " + quantityOfDining +
                ", country: " + getDestination() +
                ", nights: " + getNights() +
                ", transport: " + getTransport() +
                ", price: " + getPrice() +
                "}";
    }

    @Override
    public DealType getType() {
        return DealType.REST;
    }
}
