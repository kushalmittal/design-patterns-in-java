package factorymethod.fruit;

/**
 * Fruit interface for the Factory Method Pattern implementation.
 * 
 * This interface is similar to the one used in the Factory Pattern example,
 * as both patterns need a common interface for the products they create.
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
}