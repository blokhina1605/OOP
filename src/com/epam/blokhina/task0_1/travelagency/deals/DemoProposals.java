package com.epam.blokhina.task0_1.travelagency.deals;

import com.epam.blokhina.task0_1.travelagency.deals.impl.Rest;
import com.epam.blokhina.task0_1.travelagency.deals.impl.Shopping;
import com.epam.blokhina.task0_1.travelagency.deals.impl.Tour;
import com.epam.blokhina.task0_1.travelagency.deals.impl.Treatment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jecka on 26.04.2015.
 */
public class DemoProposals {
   private final static int COUNT = 13;
   private List<Deal> proposals = new ArrayList<Deal>();

    public DemoProposals() {
        Rest proposal1 = new Rest(12.3, true, Country.EGYPT, 7, Transports.AIRPLANE, "Hotel1", 5);
        Rest proposal2 = new Rest(13, false, Country.ITALY, 8, Transports.BUS, "Hotel2", 3);
        Rest proposal3 = new Rest(5, true, Country.TURKEY, 14, Transports.AIRPLANE, "TurkeyHotel", 3);
        Rest proposal4 = new Rest(7, false, Country.TURKEY, 12, Transports.AIRPLANE, "BadTurkeyHotel", 2);
        Treatment proposal5 = new Treatment(20, true, Country.CANADA, 14, Transports.BUS, Diagnosis.HEAD_ACHE);
        Treatment proposal6 = new Treatment(10, true, Country.CHINA, 12, Transports.SHIP, Diagnosis.ALCOHOLISM);
        Treatment proposal7 = new Treatment(25, false, Country.GERMAN, 10, Transports.TRAIN, Diagnosis.INSOMNIA);
        Shopping proposal8 = new Shopping(15, false, Country.CHINA, 7, Transports.AIRPLANE, Arrays.asList(Shop.ATB, Shop.BUDMEN, Shop.CHINASHOP));
        Shopping proposal9 = new Shopping(20, false, Country.UK, 14, Transports.AIRPLANE, Arrays.asList(Shop.BRUSNICHKA, Shop.LTB, Shop.MANGO));
        Shopping proposal10 = new Shopping(10, true, Country.USA, 7, Transports.AIRPLANE, Arrays.asList(Shop.SHOPn1, Shop.COLINS));
        Tour proposal11 = new Tour(40, true, 10, Transports.BUS, Arrays.asList(Country.DENMARK, Country.ITALY, Country.FRANCE), Arrays.asList("Bigben", "Sights2", "Sights3"));
        Tour proposal12 = new Tour(60, true, 14, Transports.SHIP, Arrays.asList(Country.SPAIN, Country.CANARY_ISLANDS, Country.UK, Country.DENMARK, Country.CHINA, Country.THAILAND), Arrays.asList("TrueSights", "NewSights"));
        Tour proposal13 = new Tour(25, false, 7, Transports.TRAIN, Arrays.asList(Country.SPAIN, Country.ITALY), Arrays.asList("TrueSightsInSpain", "NewSightsInItaly"));
        proposals.add(proposal1);
        proposals.add(proposal2);
        proposals.add(proposal3);
        proposals.add(proposal4);
        proposals.add(proposal5);
        proposals.add(proposal6);
        proposals.add(proposal7);
        proposals.add(proposal8);
        proposals.add(proposal9);
        proposals.add(proposal10);
        proposals.add(proposal11);
        proposals.add(proposal12);
        proposals.add(proposal13);
    }

    public List<Deal> getProposals() {
        return proposals;
    }
}
