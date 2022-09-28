package edu.neu.csye6200.animals;

import edu.neu.csye6200.api.AnimalisticAPI;

/**
 * @author SaiAkhil
 */
public class AnimalisticLion implements AnimalisticAPI {
    @Override
    public String speak() {
        return "Iam a Lion derived from AnimalisticAPI";
    }
    @Override
    public String toString() {
        return "Iam an Object (AnimalisticLion==" + this.getClass().getName()+")";
    }
}
