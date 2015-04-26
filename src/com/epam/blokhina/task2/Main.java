package com.epam.blokhina.task2;

/**
 * Created by jecka on 26.04.2015.
 */
public class Main {

    public static void main(String[] args) {
        Person p1 = FamilyCreator.createPerson();
        Person p2 = FamilyCreator.createPerson();
        Person child = Person.compatibilityTest(p1, p2);
        if (child != null) System.out.println(child);
    }
}
