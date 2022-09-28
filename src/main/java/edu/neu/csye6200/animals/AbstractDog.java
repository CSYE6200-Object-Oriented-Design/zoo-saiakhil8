package edu.neu.csye6200.animals;

import edu.neu.csye6200.api.AbstractAnimalAPI;

/**
 * @author SaiAkhil
 */
public class AbstractDog extends AbstractAnimalAPI {
    @Override
    public String speak() {
        return "Iam a Dog derived from AbstractAnimalAPI";
    }

    @Override
    public String toString() {
        return "Iam an Object (AbstractDog==" + this.getClass().getName()+")";
    }
}
