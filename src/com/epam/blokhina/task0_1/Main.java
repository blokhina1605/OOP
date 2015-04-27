package com.epam.blokhina.task0_1;

import com.epam.blokhina.task0_1.travelagency.SortField;
import com.epam.blokhina.task0_1.travelagency.TravelAgency;
import com.epam.blokhina.task0_1.travelagency.deals.Country;
import com.epam.blokhina.task0_1.travelagency.deals.Deal;
import com.epam.blokhina.task0_1.travelagency.deals.DemoProposals;
import com.epam.blokhina.task0_1.travelagency.deals.Transports;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jecka on 26.04.2015.
 */
public class Main {


    private static Scanner scanner;

    public static void main(String[] args) {
        System.out.println("Hi! it`s travel agency.");
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
        try {
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
                case 0:
                    System.exit(0);
                case 4:
                    resetSettings(travelAgency);
                    break;
                default:
                    System.out.println("Wrong command");
                    break;
            }
        } catch (InputMismatchException ec) {
            System.out.println("Wrong command");
        }
    }

    private static void resetSettings(TravelAgency travelAgency) {
        travelAgency.setTransportFilter(null);
        travelAgency.setSortField(null);
        travelAgency.setMinPrice(0);
        travelAgency.setMaxPrice(0);
        travelAgency.setAsc(false);
    }

    private static void findAppropriateDeals(TravelAgency travelAgency) {
        List<Deal> deals = travelAgency.findAppropriateDeals();
        System.out.println(deals);
    }

    private static void customizeFilter(TravelAgency travelAgency) {
        scanner = new Scanner(System.in);
        System.out.println("Enter the transport to search");
        System.out.println("Options: bus, airplane, train, ship");
        String transport = scanner.nextLine();
        try {
            travelAgency.setTransportFilter(Transports.valueOf(transport.toUpperCase()));
            System.out.println("Enter min price");
            int minPrice = scanner.nextInt();
            travelAgency.setMinPrice(minPrice);
            System.out.println("Enter max price");
            int maxPrice = scanner.nextInt();
            travelAgency.setMaxPrice(maxPrice);
        }
        catch (IllegalArgumentException ex) {
            System.out.println("Wrong command");
        }
    }

    private static void customizeSort(TravelAgency travelAgency) {
        scanner = new Scanner(System.in);
        System.out.println("price - to sort by price");
        System.out.println("country - to sort by country");
        String choice = scanner.nextLine();
        if(choice.equals("price") || choice.equals("country")) {
            System.out.println("true - to sort in asc");
            System.out.println("false - to sort in desc");
            boolean asc = scanner.nextBoolean();
            travelAgency.setAsc(asc);
            SortField field = SortField.valueOf(choice.toUpperCase());
            travelAgency.setSortField(field);
        }
        else System.out.println("Wrong command");
    }


    private static void help() {
        System.out.println("Please, choose the command");
        System.out.println("1 - to customize sort");
        System.out.println("2 - to customize search filter");
        System.out.println("3 - to print appropriate proposals");
        System.out.println("4 - reset settings");
        System.out.println("0 - to exit the program");
    }
}
