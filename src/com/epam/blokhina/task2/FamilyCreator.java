package com.epam.blokhina.task2;

/**
 * Created by Yevheniia_Blokhina on 4/24/2015.
 */
public class FamilyCreator {
    public static void main(String[] args) {
        Male male = new Male("Bob", "Bobov", 190, 80);
        Female female = new Female("Alice", "Alicova", 170, 70);
        Person child = Person.compatibilityTest(female, male);
        System.out.println(child);
    }
}
