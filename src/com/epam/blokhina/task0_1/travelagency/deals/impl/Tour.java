package com.epam.blokhina.task0_1.travelagency.deals.impl;

import com.epam.blokhina.task0_1.travelagency.deals.Country;
import com.epam.blokhina.task0_1.travelagency.deals.Deal;
import com.epam.blokhina.task0_1.travelagency.deals.Transports;

import java.util.List;

/**
 * Created by Yevheniia_Blokhina on 4/22/2015.
 */
public class Tour extends Deal {

    private List<Country> destination;
    private List<String> sights;

    @Override
    public Country getDestination() {
        return destination.get(0);
    }

    public Tour(double price, boolean dining, int nights, Transports transport, List<Country> destination, List<String> sights) {
        setPrice(price);
        setTransport(transport);
        setNights(nights);
        setDining(dining);
        this.destination = destination;
        this.sights = sights;
    }

    public List<Country> getCountries() {
        return destination;
    }

    public void setCountries(List<Country> countries) {
        this.destination = countries;
    }

    public List<String> getSights() {
        return sights;
    }

    public void setSights(List<String> sights) {
        this.sights = sights;
    }

    @Override
    public String toString() {
        return "\n" + "Tour {" +
                "Countries: " + destination.toString() +
                ", sights: " + sights.toString() +
                ", dining: " + isDining() +
                ", nights: " + getNights() +
                ", transport: " + getTransport() +
                ", price: " + getPrice() +
                "}";
    }

    @Override
    public DealType getType() {
        return DealType.TOUR;
    }
}
