package edu.neu.csye6200.zoo;

import edu.neu.csye6200.api.AnimalisticAPI;
import edu.neu.csye6200.api.ZooApi;

/**
 * @author SaiAkhil
 */
public class ZooAnamalisticAnimals extends ZooApi<AnimalisticAPI> {
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("=== Size of Animals in this Zoo = ").append(this.getAnimalsSize()).append("===\n");
        stringBuilder.append("===Listing and calling speak for all the animals in ZooAnamalisticAnimals(AnimalisticAPI)===").append("\n");
        this.getAnimals().forEach(animalisticAPI -> {
            //Here we are demonstrating run-time polymorphism
            // speak is overridden in all derived class
            stringBuilder.append(animalisticAPI.speak()).append("\n");
        });
        stringBuilder.append("===Listing of ZooAnamalisticAnimals done===\n");
        return stringBuilder.toString();
    }

}
