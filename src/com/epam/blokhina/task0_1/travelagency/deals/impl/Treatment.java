package com.epam.blokhina.task0_1.travelagency.deals.impl;

import com.epam.blokhina.task0_1.travelagency.deals.Country;
import com.epam.blokhina.task0_1.travelagency.deals.Diagnosis;
import com.epam.blokhina.task0_1.travelagency.deals.Deal;
import com.epam.blokhina.task0_1.travelagency.deals.Transports;

/**
 * Created by Yevheniia_Blokhina on 4/22/2015.
 */
public class Treatment extends Deal {
    private Diagnosis diagnosis;

    public Treatment() {

    }

    @Override
    public DealType getType() {
        return DealType.TREATMENT;
    }

    public Treatment(double price, boolean dining, Country destination, int nights, Transports transport, Diagnosis diagnosis) {
        super(price, dining, destination, nights, transport);
        this.diagnosis = diagnosis;
    }
    @Override
    public String toString() {
        return "\n" + "Treatment {" +
                "Country: " + getDestination() +
                ", diagnosis: " + diagnosis +
                ", dining: " + isDining() +
                ", nights: " + getNights() +
                ", transport: " + getTransport() +
                ", price: " + getPrice() +
                " -- }" ;
    }
}
