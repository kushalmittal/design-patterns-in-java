package designpatterns.abstractfactory.fruit;

import designpatterns.abstractfactory.fruit.tropical.*;

/**
 * Concrete implementation of the FruitProductFactory interface for creating tropical fruit products.
 * 
 * This is a concrete factory in the Abstract Factory pattern, responsible for creating
 * products from the "Tropical" product family.
 * 
 * DIFFERENCE FROM FACTORY METHOD PATTERN:
 * 1. In the Factory Method pattern, each concrete factory (e.g., AppleFactory) created
 *    only one type of product (e.g., Apple).
 * 
 * 2. In the Abstract Factory pattern, each concrete factory (e.g., this class) creates
 *    multiple types of related products (e.g., TropicalApple and TropicalAppleJuice)
 *    that belong to the same family.
 * 
 * 3. This allows clients to use products from the same family together, ensuring they
 *    are compatible with each other.
 */
public class TropicalFruitFactory implements FruitProductFactory {
    
    /**
     * Creates a tropical fruit.
     * 
     * @return a Fruit object from the tropical family
     */
    @Override
    public Fruit createFruit() {
        // For simplicity, we're always creating a TropicalApple
        // In a real application, this could be more complex or configurable
        return new TropicalApple();
    }
    
    /**
     * Creates a tropical juice.
     * 
     * @return a Juice object from the tropical family
     */
    @Override
    public Juice createJuice() {
        // For simplicity, we're always creating a TropicalAppleJuice
        // In a real application, this could be more complex or configurable
        return new TropicalAppleJuice();
    }
    
    /**
     * Creates a specific tropical fruit by name.
     * 
     * This is an additional method not defined in the interface, showing how
     * concrete factories can provide more specialized methods.
     * 
     * @param fruitName the name of the fruit to create
     * @return a Fruit object from the tropical family
     */
    public Fruit createSpecificFruit(String fruitName) {
        if ("banana".equalsIgnoreCase(fruitName)) {
            return new TropicalBanana();
        } else {
            // Default to apple
            return new TropicalApple();
        }
    }
    
    /**
     * Creates a specific tropical juice by name.
     * 
     * This is an additional method not defined in the interface, showing how
     * concrete factories can provide more specialized methods.
     * 
     * @param juiceName the name of the juice to create
     * @return a Juice object from the tropical family
     */
    public Juice createSpecificJuice(String juiceName) {
        if ("banana".equalsIgnoreCase(juiceName)) {
            return new TropicalBananaJuice();
        } else {
            // Default to apple juice
            return new TropicalAppleJuice();
        }
    }
}