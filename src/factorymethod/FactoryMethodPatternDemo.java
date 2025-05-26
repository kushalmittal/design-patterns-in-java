package factorymethod;

import factorymethod.fruit.*;

/**
 * Demo class to demonstrate the Factory Method Pattern.
 * 
 * DIFFERENCE FROM FACTORY PATTERN:
 * In the Factory Pattern demo (FactoryPatternDemo), we:
 * 1. Created a single factory instance
 * 2. Called its createFruit() method with different string parameters to get different fruits
 * 
 * In the Factory Method Pattern demo (this class), we:
 * 1. Create different concrete factory instances, each specialized for a specific fruit type
 * 2. Call the same method (createFruit) on each factory, but get different fruits
 * 3. Can also use the template method displayFruitInfo() defined in the abstract factory
 * 
 * This approach:
 * - Eliminates conditional logic in the factory class
 * - Makes it easier to add new fruit types without modifying existing code
 * - Provides more flexibility in how each fruit type is created
 */
public class FactoryMethodPatternDemo {
    
    public static void main(String[] args) {
        // Create an Apple factory and use it to create an Apple
        FruitFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.createFruit();
        System.out.println("Using AppleFactory:");
        System.out.println("Fruit: " + apple.getName());
        System.out.println("Color: " + apple.getColor());
        System.out.println("Taste: " + apple.getTaste());
        System.out.println();
        
        // Create an Orange factory and use it to create an Orange
        FruitFactory orangeFactory = new OrangeFactory();
        // We can also use the template method defined in the abstract factory
        System.out.println("Using OrangeFactory with template method:");
        orangeFactory.displayFruitInfo();
        
        // Create a Banana factory and use it to create a Banana
        FruitFactory bananaFactory = new BananaFactory();
        System.out.println("Using BananaFactory with template method:");
        bananaFactory.displayFruitInfo();
        
        System.out.println("FACTORY METHOD PATTERN VS FACTORY PATTERN:");
        System.out.println("1. Factory Pattern uses a single factory class with conditional logic");
        System.out.println("2. Factory Method Pattern uses multiple factory classes, each for a specific product");
        System.out.println("3. Factory Method Pattern follows the Open/Closed Principle better");
        System.out.println("4. Factory Method Pattern allows for more specialized product creation logic");
    }
}