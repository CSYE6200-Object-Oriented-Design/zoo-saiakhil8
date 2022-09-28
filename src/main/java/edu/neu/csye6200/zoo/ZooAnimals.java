package edu.neu.csye6200.zoo;

import edu.neu.csye6200.api.AnimalAPI;
import edu.neu.csye6200.api.ZooApi;

/**
 * @author SaiAkhil
 */
public class ZooAnimals extends ZooApi<AnimalAPI> {
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("=== Size of Animals in this Zoo = ").append(this.getAnimalsSize()).append("===\n");
        stringBuilder.append("===Listing and calling speak for all the animals in ZooAnimals - AnimalApi===").append("\n");
        this.getAnimals().forEach(animalAPI -> {
            stringBuilder.append(animalAPI.speak()).append("\n");
        });
        stringBuilder.append("===Listing of ZooAnimals done===\n");
        return stringBuilder.toString();
    }
}
