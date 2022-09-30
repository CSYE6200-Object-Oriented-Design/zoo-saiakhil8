package edu.neu.csye6200.api;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SaiAkhil
 */
public abstract class ZooApi<T> {

    private final List<T> animals;

    {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(T t){
        this.animals.add(t);
    }

    public int getAnimalsSize(){
        return this.animals.size();
    }

    protected List<T> getAnimals(){
        return this.animals;
    }

}
