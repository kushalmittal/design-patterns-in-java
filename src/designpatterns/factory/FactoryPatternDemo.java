package designpatterns.factory;

import designpatterns.factory.fruit.Fruit;
import designpatterns.factory.fruit.FruitFactory;

/**
 * Demo class to demonstrate the Factory Pattern.
 * This class shows how to use the FruitFactory to create different types of fruits.
 */
public class FactoryPatternDemo {
    
    public static void main(String[] args) {
        // Create a fruit factory
        FruitFactory fruitFactory = new FruitFactory();
        
        // Use the factory to create an Apple
        Fruit apple = fruitFactory.createFruit("APPLE");
        System.out.println("Fruit: " + apple.getName());
        System.out.println("Color: " + apple.getColor());
        System.out.println("Taste: " + apple.getTaste());
        System.out.println();
        
        // Use the factory to create an Orange
        Fruit orange = fruitFactory.createFruit("ORANGE");
        System.out.println("Fruit: " + orange.getName());
        System.out.println("Color: " + orange.getColor());
        System.out.println("Taste: " + orange.getTaste());
        System.out.println();
        
        // Use the factory to create a Banana
        Fruit banana = fruitFactory.createFruit("BANANA");
        System.out.println("Fruit: " + banana.getName());
        System.out.println("Color: " + banana.getColor());
        System.out.println("Taste: " + banana.getTaste());
    }
}