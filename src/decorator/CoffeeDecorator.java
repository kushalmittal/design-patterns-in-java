package decorator;

/**
 * CoffeeDecorator.java
 * 
 * This abstract class represents the base Decorator in the Decorator pattern.
 * It implements the Coffee interface and contains a reference to a Coffee object,
 * which allows it to wrap around any Coffee implementation (either a concrete component
 * or another decorator). This class serves as the foundation for all concrete decorators.
 * 
 * The key aspect of the Decorator pattern is that it follows the same interface as the
 * component it decorates, which allows for transparent wrapping of components.
 */
public abstract class CoffeeDecorator implements Coffee {
    /**
     * The wrapped Coffee object that this decorator is enhancing.
     */
    protected Coffee decoratedCoffee;
    
    /**
     * Constructor that takes a Coffee object to decorate.
     * 
     * @param decoratedCoffee The Coffee object to be decorated
     */
    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }
    
    /**
     * Delegates the getDescription call to the wrapped coffee object.
     * Concrete decorators will typically override this to add their own description.
     * 
     * @return The description from the decorated coffee
     */
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
    
    /**
     * Delegates the getCost call to the wrapped coffee object.
     * Concrete decorators will typically override this to add their own cost.
     * 
     * @return The cost from the decorated coffee
     */
    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}