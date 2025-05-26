package designpatterns.decorator;

/**
 * SimpleCoffee.java
 * 
 * This class represents a concrete component in the Decorator pattern.
 * It implements the Coffee interface and provides the basic functionality
 * without any additional features. This is the simplest form of coffee
 * that can be ordered, and other decorators will add functionality to it.
 */
public class SimpleCoffee implements Coffee {
    /**
     * Returns a description of the simple coffee.
     * 
     * @return A string describing the simple coffee
     */
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
    
    /**
     * Returns the base cost of the simple coffee.
     * 
     * @return The cost of the simple coffee as a double
     */
    @Override
    public double getCost() {
        // Base price for a simple coffee
        return 2.0;
    }
}