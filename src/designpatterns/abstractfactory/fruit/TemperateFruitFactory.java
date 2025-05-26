package designpatterns.abstractfactory.fruit;

import designpatterns.abstractfactory.fruit.temperate.*;

/**
 * Concrete implementation of the FruitProductFactory interface for creating temperate fruit products.
 * 
 * This is a concrete factory in the Abstract Factory pattern, responsible for creating
 * products from the "Temperate" product family.
 * 
 * DIFFERENCE FROM FACTORY METHOD PATTERN:
 * 1. In the Factory Method pattern, each concrete factory (e.g., AppleFactory) created
 *    only one type of product (e.g., Apple).
 * 
 * 2. In the Abstract Factory pattern, each concrete factory (e.g., this class) creates
 *    multiple types of related products (e.g., TemperateApple and TemperateAppleJuice)
 *    that belong to the same family.
 * 
 * 3. This ensures that the products created by this factory are compatible with each other,
 *    as they all belong to the same "Temperate" family.
 */
public class TemperateFruitFactory implements FruitProductFactory {
    
    /**
     * Creates a temperate fruit.
     * 
     * @return a Fruit object from the temperate family
     */
    @Override
    public Fruit createFruit() {
        // For simplicity, we're always creating a TemperateApple
        // In a real application, this could be more complex or configurable
        return new TemperateApple();
    }
    
    /**
     * Creates a temperate juice.
     * 
     * @return a Juice object from the temperate family
     */
    @Override
    public Juice createJuice() {
        // For simplicity, we're always creating a TemperateAppleJuice
        // In a real application, this could be more complex or configurable
        return new TemperateAppleJuice();
    }
    
    /**
     * Creates a specific temperate fruit by name.
     * 
     * This is an additional method not defined in the interface, showing how
     * concrete factories can provide more specialized methods.
     * 
     * @param fruitName the name of the fruit to create
     * @return a Fruit object from the temperate family
     */
    public Fruit createSpecificFruit(String fruitName) {
        if ("pear".equalsIgnoreCase(fruitName)) {
            return new TemperatePear();
        } else {
            // Default to apple
            return new TemperateApple();
        }
    }
    
    /**
     * Creates a specific temperate juice by name.
     * 
     * This is an additional method not defined in the interface, showing how
     * concrete factories can provide more specialized methods.
     * 
     * @param juiceName the name of the juice to create
     * @return a Juice object from the temperate family
     */
    public Juice createSpecificJuice(String juiceName) {
        if ("pear".equalsIgnoreCase(juiceName)) {
            return new TemperatePearJuice();
        } else {
            // Default to apple juice
            return new TemperateAppleJuice();
        }
    }
}