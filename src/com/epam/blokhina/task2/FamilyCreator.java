package com.epam.blokhina.task2;

import sun.management.counter.perf.PerfByteArrayCounter;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Yevheniia_Blokhina on 4/24/2015.
 */
public class FamilyCreator {


    public static Person createPerson() {
        Person person = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, create the person");
        person = getPerson(person);
        System.out.print("ENter the name: ");
        person.setFirstName(scanner.nextLine());
        System.out.print("ENter lastName: ");
        person.setLastName(scanner.nextLine());
        while (person.getHeight() == 0) {
            try {
                System.out.print("Enter the height: ");
                person.setHeight(Float.parseFloat(scanner.nextLine().replaceAll("\\W", ".")));
            } catch (NumberFormatException ex) {
                System.out.println("You entered wrong value");
            }
        }
        while (person.getWeight() == 0) {
            try {
                System.out.print("Enter the weight: ");
                person.setWeight(Float.parseFloat(scanner.nextLine().replaceAll("\\W", ".")));
            } catch (NumberFormatException ex) {
                System.out.println("You entered wrong value");
            }
        }
        return person;
    }

    private static Person getPerson(Person person) {
        Scanner scanner = new Scanner(System.in);
        boolean s = true;
        while (s) {
            System.out.print("gender (f - female, m - male): ");
            String str = scanner.nextLine().toLowerCase();
            switch (str) {
                case "m":
                    person = new Male();
                    s = false;
                    break;
                case "f":
                    person = new Female();
                    s = false;
                    break;
                default:
                    System.out.println("it`s not a person!");
                    break;
            }
        }
        return person;
    }
}
