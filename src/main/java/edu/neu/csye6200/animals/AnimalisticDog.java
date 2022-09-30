package edu.neu.csye6200.animals;

import edu.neu.csye6200.api.AnimalisticAPI;

/**
 * @author SaiAkhil
 */
public class AnimalisticDog implements AnimalisticAPI {
    @Override
    public String animalisticSpeak() {
        return "Iam a Dog derived from AnimalisticAPI";
    }
    @Override
    public String toString() {
        return "Iam an Object (AnimalisticDog==" + this.getClass().getName()+")";
    }
}
