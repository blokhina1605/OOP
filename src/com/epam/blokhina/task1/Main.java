package com.epam.blokhina.task1;

/**
 * Created by jecka on 26.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        Container cont = new Container();
        cont.add(new Hat("Hat1", 12.2, 1, "sombrero"));
        cont.add(new Hat("Hat2", 16, 2, "toque"));
        cont.add(new Footwear("Shoe1", 20, 3, "brown", 28));
        cont.add(new Footwear("Shoe2", 10, 1, "red", 21));
        cont.add(new Footwear("Shoe4", 143, 1, "black", 41));
        System.out.println("---Original container---");
        System.out.println(cont);
        System.out.println("------------------------");
        System.out.println("item number 2");
        System.out.println(cont.getProduct(2));
        System.out.println("------------------------");
        cont.sortByPrice();
        System.out.println("---Sorted by price container---");
        System.out.println(cont);
        System.out.println("------------------------");
        System.out.println("item number 2");
        System.out.println(cont.getProduct(2));
    }

}
