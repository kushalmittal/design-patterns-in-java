package designpatterns.abstractfactory.fruit;

/**
 * Abstract Factory interface for the Abstract Factory Pattern implementation.
 * 
 * This interface defines the methods for creating related products (Fruit and Juice)
 * that belong to the same product family.
 * 
 * DIFFERENCE FROM FACTORY METHOD PATTERN:
 * 1. In the Factory Method pattern, the abstract factory (FruitFactory) had a single
 *    factory method (createFruit()) for creating a single type of product.
 * 
 * 2. In the Abstract Factory pattern, the abstract factory (this interface) has multiple
 *    factory methods (createFruit() and createJuice()) for creating different types of
 *    related products that belong to the same family.
 * 
 * 3. Each concrete implementation of this interface will create a complete family of products
 *    (e.g., TropicalFruitFactory creates tropical fruits and tropical juices, while
 *    TemperateFruitFactory creates temperate fruits and temperate juices).
 * 
 * This pattern is useful when:
 * - Your system needs to create multiple families of related products
 * - You want to ensure that the created products are compatible with each other
 * - You want to isolate concrete classes from client code
 */
public interface FruitProductFactory {
    /**
     * Creates a fruit product.
     * 
     * @return a Fruit object from a specific family
     */
    Fruit createFruit();
    
    /**
     * Creates a juice product.
     * 
     * @return a Juice object from a specific family
     */
    Juice createJuice();
}