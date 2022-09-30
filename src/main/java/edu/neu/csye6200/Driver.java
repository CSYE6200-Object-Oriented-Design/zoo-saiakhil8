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
        //Creating instance of ZooAnimals
        ZooAnimals zooAnimals = new ZooAnimals();
        /*
          Adding classes derived from AnimalAPI to the zooAnimals
          ZooAnimals is inherited from ZooAPI [See the methods in ZooAPI] with generic type as AnimalAPI
          toString() of ZooAnimals is overridden, so toString() call is not required in print statement
         */
        zooAnimals.addAnimal(new Dog());
        zooAnimals.addAnimal(new Lion());
        zooAnimals.addAnimal(new Tiger());
        System.out.println("==================ZOO ANIMALS================");
        System.out.println(zooAnimals);

        /*
          Initializing ZooAbstractAnimals
          Adding classes derived from AnimalAPI to the zooAnimals
          ZooAbstractAnimals is inherited from ZooAPI [See the methods in ZooAPI]
                                           with generic type as AbstractAnimalAPI
                                           so we can add all the classes derived from AbstractAnimalAPI
          toString() of ZooAbstractAnimals is overridden, so toString() call is not required in print statement
         */
        ZooAbstractAnimals zooAbstractAnimals = new ZooAbstractAnimals();
        zooAbstractAnimals.addAnimal(new AbstractDog());
        zooAbstractAnimals.addAnimal(new AbstractLion());
        zooAbstractAnimals.addAnimal(new AbstractTiger());
        System.out.println("==================ZOO Abstract ANIMALS================");
        System.out.println(zooAbstractAnimals);

        /*
          Initializing ZooAnimalisticAnimals
          Adding classes derived from AnimalAPI to the zooAnimals
          ZooAnimalisticAnimals is inherited from ZooAPI [See the methods in ZooAPI]
                                           with generic type as AnimalisticAPI
                                           so we can add all the classes derived from AbstractAnimalAPI
          toString() of ZooAnimalisticAnimals is overridden, so toString() call is not required in print statement
         */
        ZooAnamalisticAnimals zooAnamalisticAnimals =  new ZooAnamalisticAnimals();
        zooAnamalisticAnimals.addAnimal(new AnimalisticDog());
        zooAnamalisticAnimals.addAnimal(new AnimalisticLion());
        zooAnamalisticAnimals.addAnimal(new AnimalisticTiger());
        System.out.println("==================ZOO Animalistic ANIMALS================");
        System.out.println(zooAnamalisticAnimals);

        /*
          Initializing ZooObjectAnimals
          Adding classes derived from AnimalAPI to the zooAnimals
          ZooObjectAnimals is inherited from ZooAPI [See the methods in ZooAPI]
                                           with generic type as Object
          *********************************************************************************
          Ever wondered from where we are getting toString() method?
          In Java all classes are inherited from Object by default even if we dont mention
          So technically all classes are Objects
          So here we are adding all the animals to the list
          *********************************************************************************
          toString() of ZooObjectAnimals is overridden, so toString() call is not required in print statement
         */
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
