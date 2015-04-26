package com.epam.blokhina.task2;

import java.util.Scanner;

/**
 * Created by Yevheniia_Blokhina on 4/24/2015.
 */
public class Female extends Person {


    public Female() {
        super();
        this.gender = false;
    }

    public Female(String firstName, String lastName, float height, float weight) {
        super(firstName, lastName, height, weight);
        this.gender = false;
    }

    public Person giveBirth(Person person) {
        System.out.println("--------");
        Person child = isaBoolean(0.5) ? getPerson(this, person) : null;
        if (child == null) System.out.println("Nothing happened. Sorry, they tried..");
        return child;
    }

    private Person getPerson(Person female, Person male) {
        Scanner sc = new Scanner(System.in);
        Person child = isaBoolean(0.5) ? new Male() : new Female();
        if (child instanceof Male) {
            System.out.println("A boy was born");
            child.setHeight((float) (male.getHeight() + 0.1 * (female.getHeight() - male.getHeight())));
            child.setWeight((float) (male.getWeight() + 0.1 * (female.getWeight() - male.getWeight())));
        } else {
            System.out.println("A girl was born");
            child.setHeight((float) (female.getHeight() + 0.1 * (male.getHeight() - female.getHeight())));
            child.setWeight((float) (female.getWeight() + 0.1 * (male.getWeight() - female.getWeight())));
        }
        System.out.println("Enter the name of child");
        child.setFirstName(sc.nextLine());
        child.setLastName(male.getLastName());
        return child;
    }


}
