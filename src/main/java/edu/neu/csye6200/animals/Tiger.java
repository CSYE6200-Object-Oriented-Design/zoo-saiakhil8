package edu.neu.csye6200.animals;

import edu.neu.csye6200.api.AnimalAPI;

/**
 * @author SaiAkhil
 */
public class Tiger extends AnimalAPI {
    @Override
    public String speak() {
        return "Iam a Tiger derived from Animal API";
    }

    @Override
    public String toString() {
        return "Iam an Object (Tiger==" + this.getClass().getName()+")";
    }
}
