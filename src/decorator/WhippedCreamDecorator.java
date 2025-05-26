package decorator;

/**
 * WhippedCreamDecorator.java
 * 
 * This class represents another concrete decorator in the Decorator pattern.
 * It extends the CoffeeDecorator abstract class and adds whipped cream functionality
 * to any Coffee object. When whipped cream is added to a coffee, both the description
 * and the cost of the coffee are modified.
 * 
 * This demonstrates how decorators can be stacked to create complex combinations
 * of behaviors without creating an explosion of subclasses.
 */
public class WhippedCreamDecorator extends CoffeeDecorator {
    /**
     * Constructor that takes a Coffee object to decorate with whipped cream.
     * 
     * @param decoratedCoffee The Coffee object to be decorated with whipped cream
     */
    public WhippedCreamDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    
    /**
     * Extends the description of the decorated coffee by adding whipped cream information.
     * 
     * @return The updated description including whipped cream
     */
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", with Whipped Cream";
    }
    
    /**
     * Increases the cost of the decorated coffee by adding the price of whipped cream.
     * 
     * @return The updated cost including whipped cream
     */
    @Override
    public double getCost() {
        // Add the cost of whipped cream to the base coffee cost
        return decoratedCoffee.getCost() + 0.7;
    }
}