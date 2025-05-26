package designpatterns.decorator;

/**
 * MilkDecorator.java
 * 
 * This class represents a concrete decorator in the Decorator pattern.
 * It extends the CoffeeDecorator abstract class and adds milk functionality
 * to any Coffee object. When milk is added to a coffee, both the description
 * and the cost of the coffee are modified.
 * 
 * This demonstrates how decorators can add responsibilities to objects without
 * making changes to the underlying classes.
 */
public class MilkDecorator extends CoffeeDecorator {
    /**
     * Constructor that takes a Coffee object to decorate with milk.
     * 
     * @param decoratedCoffee The Coffee object to be decorated with milk
     */
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    
    /**
     * Extends the description of the decorated coffee by adding milk information.
     * 
     * @return The updated description including milk
     */
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", with Milk";
    }
    
    /**
     * Increases the cost of the decorated coffee by adding the price of milk.
     * 
     * @return The updated cost including milk
     */
    @Override
    public double getCost() {
        // Add the cost of milk to the base coffee cost
        return decoratedCoffee.getCost() + 0.5;
    }
}