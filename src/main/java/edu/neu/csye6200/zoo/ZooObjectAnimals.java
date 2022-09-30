package edu.neu.csye6200.zoo;

import edu.neu.csye6200.api.ZooApi;

/**
 * @author SaiAkhil
 */
public class ZooObjectAnimals extends ZooApi<Object> {
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("=== Size of Objects in this Zoo = ").append(this.getAnimalsSize()).append("===").append("\n");
        stringBuilder.append("===Listing all the objects in ZooObjectAnimals(Object API)===").append("\n");
        this.getAnimals().forEach(object -> {
            //Here we are demonstrating run-time polymorphism
            // toString() call is not required is SysOut
            // toString() is overridden in all derived class
            stringBuilder.append(object).append("\n");
        });
        stringBuilder.append("===Listing of ZooObjectAnimals done===\n");
        return stringBuilder.toString();
    }
}
