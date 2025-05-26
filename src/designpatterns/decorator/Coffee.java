package designpatterns.decorator;

/**
 * Coffee.java
 * 
 * This interface represents the base Component in the Decorator pattern.
 * It defines the core functionality that all concrete components and decorators must implement.
 * In this example, a Coffee object can provide its description and calculate its cost.
 */
public interface Coffee {
    /**
     * Returns a description of the coffee, including any added condiments.
     * 
     * @return A string describing the coffee
     */
    String getDescription();

    /**
     * Calculates the total cost of the coffee, including any added condiments.
     * 
     * @return The cost of the coffee as a double
     */
    double getCost();
}
