package edu.neu.csye6200.animals;

import edu.neu.csye6200.api.AnimalAPI;

/**
 * @author SaiAkhil
 */
public class Lion extends AnimalAPI {
    @Override
    public String speak() {
        return "Iam a lion derived from Animal API";
    }

    @Override
    public String toString() {
        return "Iam an Object (Lion==" + this.getClass().getName()+")";
    }
}
