package com.epam.blokhina.task0_1;

import com.epam.blokhina.task0_1.travelagency.SortField;
import com.epam.blokhina.task0_1.travelagency.TravelAgency;
import com.epam.blokhina.task0_1.travelagency.deals.Country;
import com.epam.blokhina.task0_1.travelagency.deals.Deal;
import com.epam.blokhina.task0_1.travelagency.deals.DemoProposals;

import java.util.List;
import java.util.Scanner;

/**
 * Created by jecka on 26.04.2015.
 */
public class Main {


    private static Scanner scanner;

    public static void main(String[] args) {
        List<Deal> proposals = new DemoProposals().getProposals();
        TravelAgency travelAgency = new TravelAgency(proposals);
        while (true) {
            consoleMenu(travelAgency);
        }
    }

    private static void consoleMenu(TravelAgency travelAgency) {
        scanner = new Scanner(System.in);
        help();
        System.out.print("> ");

        int ch = scanner.nextInt();
        switch (ch) {
            case 1:
                customizeSort(travelAgency);
                break;
            case 2:
                customizeFilter(travelAgency);
                break;
            case 3:
                findAppropriateDeals(travelAgency);
                break;
            case 4:
                System.exit(1);
            default:
                help();
                break;
        }
    }

    private static void findAppropriateDeals(TravelAgency travelAgency) {
        List<Deal> deals = travelAgency.findAppropriateDeals();
        System.out.println(deals);
    }

    private static void customizeFilter(TravelAgency travelAgency) {
        scanner = new Scanner(System.in);
        System.out.println("country");
        String country = scanner.nextLine();
        travelAgency.setCountryFilter(Country.valueOf(country.toUpperCase()));
        System.out.println("minPrice");
        int minPrice = scanner.nextInt();
        travelAgency.setMinPrice(minPrice);
        System.out.println("maxPrice");
        int maxPrice = scanner.nextInt();
        travelAgency.setMaxPrice(maxPrice);
    }

    private static void customizeSort(TravelAgency travelAgency) {
        scanner = new Scanner(System.in);
        System.out.println("PRICE, countr, type");
        String choice = scanner.nextLine();
        System.out.println("Storona");
        boolean asc = scanner.nextBoolean();
        travelAgency.setAsc(asc);
        SortField field = SortField.valueOf(choice.toUpperCase());
        travelAgency.setSortField(field);
    }


    private static void help() {
        System.out.println("Please, choose the command");
        System.out.println("1 - to customize sort");
        System.out.println("2 - to customize search filter");
        System.out.println("3 - ");
    }
}
