package edu.neu.csye6200;

import edu.neu.csye6200.animals.*;
import edu.neu.csye6200.zoo.ZooAbstractAnimals;
import edu.neu.csye6200.zoo.ZooAnamalisticAnimals;
import edu.neu.csye6200.zoo.ZooAnimals;
import edu.neu.csye6200.zoo.ZooObjectAnimals;

/**
 * @author SaiAkhil
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");
        Driver.demo();
        System.out.println("\n\n============Main Execution End===================");
    }

    public static void demo(){
        ZooAnimals zooAnimals = new ZooAnimals();
        zooAnimals.addAnimal(new Dog());
        zooAnimals.addAnimal(new Lion());
        zooAnimals.addAnimal(new Tiger());
        System.out.println("==================ZOO ANIMALS================");
        System.out.println(zooAnimals);

        ZooAbstractAnimals zooAbstractAnimals = new ZooAbstractAnimals();
        zooAbstractAnimals.addAnimal(new AbstractDog());
        zooAbstractAnimals.addAnimal(new AbstractLion());
        zooAbstractAnimals.addAnimal(new AbstractTiger());
        System.out.println("==================ZOO Abstract ANIMALS================");
        System.out.println(zooAbstractAnimals);

        ZooAnamalisticAnimals zooAnamalisticAnimals =  new ZooAnamalisticAnimals();
        zooAnamalisticAnimals.addAnimal(new AnimalisticDog());
        zooAnamalisticAnimals.addAnimal(new AnimalisticLion());
        zooAnamalisticAnimals.addAnimal(new AnimalisticTiger());
        System.out.println("==================ZOO Animalistic ANIMALS================");
        System.out.println(zooAnamalisticAnimals);

        ZooObjectAnimals zooObjectAnimals = new ZooObjectAnimals();
        zooObjectAnimals.addAnimal(new Object());
        zooObjectAnimals.addAnimal(new Dog());
        zooObjectAnimals.addAnimal(new AbstractDog());
        zooObjectAnimals.addAnimal(new AnimalisticDog());
        zooObjectAnimals.addAnimal(new Lion());
        zooObjectAnimals.addAnimal(new AbstractLion());
        zooObjectAnimals.addAnimal(new AnimalisticLion());
        zooObjectAnimals.addAnimal(new Tiger());
        zooObjectAnimals.addAnimal(new AbstractTiger());
        zooObjectAnimals.addAnimal(new AnimalisticTiger());
        System.out.println("==================** ZOO Object ANIMALS - OBJECT API **================");
        System.out.println(zooObjectAnimals);

    }
}
