package abstractfactory;

import abstractfactory.fruit.*;

/**
 * Demo class to demonstrate the Abstract Factory Pattern.
 * 
 * ABSTRACT FACTORY PATTERN:
 * The Abstract Factory Pattern provides an interface for creating families of related
 * or dependent objects without specifying their concrete classes.
 * 
 * KEY COMPONENTS:
 * 1. Abstract Product Interfaces (Fruit, Juice): Define interfaces for the products
 * 2. Concrete Products (TropicalApple, TemperatePear, etc.): Implement the product interfaces
 * 3. Abstract Factory Interface (FruitProductFactory): Defines methods for creating products
 * 4. Concrete Factories (TropicalFruitFactory, TemperateFruitFactory): Implement the factory interface
 * 
 * DIFFERENCES FROM FACTORY METHOD PATTERN:
 * 1. Factory Method Pattern:
 *    - Creates a single type of product (e.g., only Fruit)
 *    - Each concrete factory creates one specific product (e.g., AppleFactory creates Apple)
 *    - Focus is on creating a single object through inheritance and method overriding
 * 
 * 2. Abstract Factory Pattern:
 *    - Creates multiple types of related products (e.g., Fruit and Juice)
 *    - Each concrete factory creates a family of related products (e.g., TropicalFruitFactory 
 *      creates TropicalApple and TropicalAppleJuice)
 *    - Focus is on creating families of related objects
 *    - Ensures that the created products are compatible with each other
 * 
 * WHEN TO USE ABSTRACT FACTORY:
 * - When your system needs to create multiple families of related products
 * - When you want to ensure that the products you use together are compatible
 * - When you want to provide a library of products without exposing implementation details
 */
public class AbstractFactoryPatternDemo {
    
    public static void main(String[] args) {
        // Create a tropical fruit factory
        System.out.println("Using Tropical Fruit Factory:");
        FruitProductFactory tropicalFactory = new TropicalFruitFactory();
        
        // Use the factory to create tropical products
        Fruit tropicalFruit = tropicalFactory.createFruit();
        Juice tropicalJuice = tropicalFactory.createJuice();
        
        // Display information about the tropical products
        System.out.println("Fruit: " + tropicalFruit.getName());
        System.out.println("Color: " + tropicalFruit.getColor());
        System.out.println("Taste: " + tropicalFruit.getTaste());
        System.out.println("Climate: " + tropicalFruit.getClimate());
        System.out.println();
        
        System.out.println("Juice: " + tropicalJuice.getName());
        System.out.println("Color: " + tropicalJuice.getColor());
        System.out.println("Taste: " + tropicalJuice.getTaste());
        System.out.println("Source Fruit: " + tropicalJuice.getSourceFruit());
        System.out.println("Climate: " + tropicalJuice.getClimate());
        System.out.println();
        
        // Create a temperate fruit factory
        System.out.println("Using Temperate Fruit Factory:");
        FruitProductFactory temperateFactory = new TemperateFruitFactory();
        
        // Use the factory to create temperate products
        Fruit temperateFruit = temperateFactory.createFruit();
        Juice temperateJuice = temperateFactory.createJuice();
        
        // Display information about the temperate products
        System.out.println("Fruit: " + temperateFruit.getName());
        System.out.println("Color: " + temperateFruit.getColor());
        System.out.println("Taste: " + temperateFruit.getTaste());
        System.out.println("Climate: " + temperateFruit.getClimate());
        System.out.println();
        
        System.out.println("Juice: " + temperateJuice.getName());
        System.out.println("Color: " + temperateJuice.getColor());
        System.out.println("Taste: " + temperateJuice.getTaste());
        System.out.println("Source Fruit: " + temperateJuice.getSourceFruit());
        System.out.println("Climate: " + temperateJuice.getClimate());
        System.out.println();
        
        // Demonstrate creating specific products using the extended methods
        System.out.println("Creating specific tropical products:");
        TropicalFruitFactory specificTropicalFactory = (TropicalFruitFactory) tropicalFactory;
        Fruit tropicalBanana = specificTropicalFactory.createSpecificFruit("banana");
        Juice tropicalBananaJuice = specificTropicalFactory.createSpecificJuice("banana");
        
        System.out.println("Specific Fruit: " + tropicalBanana.getName());
        System.out.println("Specific Juice: " + tropicalBananaJuice.getName());
        System.out.println();
        
        System.out.println("Creating specific temperate products:");
        TemperateFruitFactory specificTemperateFactory = (TemperateFruitFactory) temperateFactory;
        Fruit temperatePear = specificTemperateFactory.createSpecificFruit("pear");
        Juice temperatePearJuice = specificTemperateFactory.createSpecificJuice("pear");
        
        System.out.println("Specific Fruit: " + temperatePear.getName());
        System.out.println("Specific Juice: " + temperatePearJuice.getName());
        System.out.println();
        
        System.out.println("ABSTRACT FACTORY PATTERN VS FACTORY METHOD PATTERN:");
        System.out.println("1. Factory Method creates a single product type, Abstract Factory creates families of related products");
        System.out.println("2. Factory Method uses inheritance (subclassing), Abstract Factory uses composition");
        System.out.println("3. Factory Method focuses on creating one product, Abstract Factory ensures product compatibility");
        System.out.println("4. Factory Method is simpler but less flexible, Abstract Factory is more complex but more powerful");
    }
}