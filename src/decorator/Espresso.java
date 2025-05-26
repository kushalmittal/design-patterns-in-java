package decorator;

/**
 * Espresso.java
 * 
 * This class represents another concrete component in the Decorator pattern.
 * It implements the Coffee interface and provides the functionality for an Espresso coffee.
 * Espresso is a stronger, more concentrated form of coffee with a different price point
 * compared to a simple coffee.
 */
public class Espresso implements Coffee {
    /**
     * Returns a description of the espresso coffee.
     * 
     * @return A string describing the espresso coffee
     */
    @Override
    public String getDescription() {
        return "Espresso";
    }
    
    /**
     * Returns the base cost of the espresso coffee.
     * 
     * @return The cost of the espresso coffee as a double
     */
    @Override
    public double getCost() {
        // Espresso is typically more expensive than simple coffee
        return 3.5;
    }
}