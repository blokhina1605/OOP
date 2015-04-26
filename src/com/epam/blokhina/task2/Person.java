package com.epam.blokhina.task2;

import java.util.Random;

import static java.lang.Math.abs;

/**
 * Created by Yevheniia_Blokhina on 4/24/2015.
 */
public abstract class Person {
    protected boolean gender;
    protected String firstName;
    protected String lastName;
    protected float height;
    protected float weight;

    public Person(String firstName, String lastName, float height, float weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
    }

    public Person() {
    }

    public boolean isGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean talk(Person person) {
        return this.subTalk(person) ? true : isaBoolean(0.5);
    }

    private boolean subTalk(Person person) {
        if (this.isGender() || person.isGender()) return true;
        return false;
    }

    public boolean bearSociety(Person person) {
        if (!this.isGender() && !person.isGender()) return isaBoolean(0.05);
        if (this.isGender() != person.isGender()) return isaBoolean(0.7);
        if (this.isGender() && person.isGender()) return isaBoolean(0.056);
        return false;
    }

    public boolean isaBoolean(double prob) {
        Random random = new Random();
        return random.nextDouble() <= prob ? true : false;
    }

    public boolean spendTimeTogether(Person person) {
        double diff = abs(this.getHeight() / person.getHeight() - 1);
        return diff <= 0.1 ? isaBoolean(0.85) : isaBoolean(0.95);
    }

    public Person haveRelationship(Person person) {
        System.out.print("===Person #1===");System.out.println(this);
        System.out.print("===Person #2===");System.out.println(person);
        Person child = null;
        System.out.println("-----Compatibility test-----");
        boolean a = this.talk(person);
        System.out.println("Can talk: " + a);
        boolean b = this.bearSociety(person);
        System.out.println("Can bear society: " + b);
        boolean c = this.spendTimeTogether(person);
        System.out.println("Can spend time together: " + c);

        if (a && b && c) {
            if (this.isGender() && person.isGender()) {
                System.out.println("Unfortunately, they are the same gender");
                return null;
            }
            else {
                if (this instanceof Female)
                    child = ((Female) this).giveBirth(person);
                else
                    child = ((Female) person).giveBirth(this);
            }
        }
        else System.out.println("They are not compatible");
        return child;
    }

    public static Person compatibilityTest(Person p1, Person p2) {
        return p1.haveRelationship(p2);
    }

    @Override
    public String toString() {
        String genderstr = "male";
        if (!this.isGender()) genderstr = "female";
        return
                " gender=" + genderstr +
                ", " + firstName + lastName +
                ", height=" + height +
                ", weight=" + weight;
    }
}
