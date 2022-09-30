package edu.neu.csye6200.zoo;

import edu.neu.csye6200.api.AbstractAnimalAPI;
import edu.neu.csye6200.api.ZooApi;

/**
 * @author SaiAkhil
 */
public class ZooAbstractAnimals extends ZooApi<AbstractAnimalAPI> {
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("=== Size of Animals in this Zoo = ").append(this.getAnimalsSize()).append("===\n");
        stringBuilder.append("===Listing and calling speak for all the animals in ZooAbstractAnimals(AbstractAnimalAPI)===").append("\n");
        this.getAnimals().forEach(abstractAnimalAPI -> {
            //Here we are demonstrating run-time polymorphism
            // speak is overridden in all derived class
            stringBuilder.append(abstractAnimalAPI.abstractSpeak()).append("\n");
        });
        stringBuilder.append("===Listing of ZooAbstractAnimals done===\n");
        return stringBuilder.toString();
    }
}
