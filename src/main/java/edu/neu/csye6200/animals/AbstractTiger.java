package edu.neu.csye6200.animals;

import edu.neu.csye6200.api.AbstractAnimalAPI;

/**
 * @author SaiAkhil
 */
public class AbstractTiger extends AbstractAnimalAPI {
    @Override
    public String abstractSpeak() {
        return "Iam a Tiger derived from AbstractAnimalAPI";
    }
    @Override
    public String toString() {
        return "Iam an Object (AbstractTiger==" + this.getClass().getName()+")";
    }
}
