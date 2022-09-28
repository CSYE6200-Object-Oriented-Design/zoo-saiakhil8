package edu.neu.csye6200.animals;

import edu.neu.csye6200.api.AbstractAnimalAPI;

/**
 * @author SaiAkhil
 */
public class AbstractLion extends AbstractAnimalAPI {
    @Override
    public String speak() {
        return "Iam a Lion derived from AbstractAnimalAPI";
    }
    @Override
    public String toString() {
        return "Iam an Object (AbstractLion==" + this.getClass().getName()+")";
    }
}
