package abstractfactory.fruit;

/**
 * Fruit interface for the Abstract Factory Pattern implementation.
 * 
 * This is one of the abstract product interfaces in the Abstract Factory pattern.
 * It defines the common interface for all fruit products, regardless of their family.
 * 
 * DIFFERENCE FROM FACTORY METHOD PATTERN:
 * In the Factory Method pattern, we had a single product interface (Fruit).
 * In the Abstract Factory pattern, we have multiple product interfaces (Fruit, Juice, etc.)
 * that are part of the same product family.
 */
public interface Fruit {
    /**
     * Get the name of the fruit.
     * 
     * @return the name of the fruit
     */
    String getName();

    /**
     * Get the color of the fruit.
     * 
     * @return the color of the fruit
     */
    String getColor();

    /**
     * Get the taste of the fruit.
     * 
     * @return the taste of the fruit
     */
    String getTaste();
    
    /**
     * Get the climate where this fruit grows best.
     * 
     * @return the climate type (e.g., "Tropical", "Temperate")
     */
    String getClimate();
}