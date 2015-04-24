package com.epam.blokhina.task2;

/**
 * Created by Yevheniia_Blokhina on 4/24/2015.
 */
public class Male extends Person {

    public Male(String firstName, String lastName, float height, float weight) {
        super(firstName, lastName, height, weight);
        this.gender = true;
    }
    public Male(){
        super();
        this.gender = true;
    }

}
