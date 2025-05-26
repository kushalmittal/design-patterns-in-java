package designpatterns.decorator;

/**
 * SugarDecorator.java
 * 
 * This class represents another concrete decorator in the Decorator pattern.
 * It extends the CoffeeDecorator abstract class and adds sugar functionality
 * to any Coffee object. When sugar is added to a coffee, both the description
 * and the cost of the coffee are modified.
 * 
 * This demonstrates how multiple decorators can be used to add different
 * responsibilities to the same object, allowing for flexible combinations.
 */
public class SugarDecorator extends CoffeeDecorator {
    /**
     * Constructor that takes a Coffee object to decorate with sugar.
     * 
     * @param decoratedCoffee The Coffee object to be decorated with sugar
     */
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    
    /**
     * Extends the description of the decorated coffee by adding sugar information.
     * 
     * @return The updated description including sugar
     */
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", with Sugar";
    }
    
    /**
     * Increases the cost of the decorated coffee by adding the price of sugar.
     * 
     * @return The updated cost including sugar
     */
    @Override
    public double getCost() {
        // Add the cost of sugar to the base coffee cost
        return decoratedCoffee.getCost() + 0.2;
    }
}