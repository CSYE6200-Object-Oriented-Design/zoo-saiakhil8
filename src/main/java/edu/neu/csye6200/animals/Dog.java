package edu.neu.csye6200.animals;

import edu.neu.csye6200.api.AnimalAPI;

/**
 * @author SaiAkhil
 */
public class Dog extends AnimalAPI {
    @Override
    public String speak() {
        return "Iam a Dog derived from Animal API";
    }

    @Override
    public String toString() {
        return "Iam an Object (Dog==" + this.getClass().getName()+")";
    }
}
