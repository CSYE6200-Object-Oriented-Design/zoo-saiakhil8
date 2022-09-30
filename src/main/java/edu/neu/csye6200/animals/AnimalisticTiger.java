package edu.neu.csye6200.animals;

import edu.neu.csye6200.api.AnimalisticAPI;

/**
 * @author SaiAkhil
 */
public class AnimalisticTiger implements AnimalisticAPI {
    @Override
    public String animalisticSpeak() {
        return "Iam a Tiger derived from AnimalisticAPI";
    }
    @Override
    public String toString() {
        return "Iam an Object (AnimalisticTiger==" + this.getClass().getName()+")";
    }
}
