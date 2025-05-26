package designpatterns.abstractfactory.fruit;

/**
 * Juice interface for the Abstract Factory Pattern implementation.
 * 
 * This is the second abstract product interface in our Abstract Factory pattern.
 * It defines the common interface for all juice products, regardless of their family.
 * 
 * DIFFERENCE FROM FACTORY METHOD PATTERN:
 * In the Factory Method pattern, we had only one product type (Fruit).
 * In the Abstract Factory pattern, we have multiple product types (Fruit, Juice)
 * that are related and part of the same product family.
 * 
 * This demonstrates how Abstract Factory creates families of related products,
 * while Factory Method focuses on creating a single product type.
 */
public interface Juice {
    /**
     * Get the name of the juice.
     * 
     * @return the name of the juice
     */
    String getName();
    
    /**
     * Get the color of the juice.
     * 
     * @return the color of the juice
     */
    String getColor();
    
    /**
     * Get the taste of the juice.
     * 
     * @return the taste of the juice
     */
    String getTaste();
    
    /**
     * Get the fruit this juice is made from.
     * 
     * @return the source fruit name
     */
    String getSourceFruit();
    
    /**
     * Get the climate where the source fruit grows best.
     * 
     * @return the climate type (e.g., "Tropical", "Temperate")
     */
    String getClimate();
}