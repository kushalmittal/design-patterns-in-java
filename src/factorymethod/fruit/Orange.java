package factorymethod.fruit;

/**
 * Concrete implementation of the Fruit interface for Orange.
 * 
 * This class is similar to the one used in the Factory Pattern example,
 * as both patterns use the same concrete product classes.
 */
public class Orange implements Fruit {
    
    @Override
    public String getName() {
        return "Orange";
    }
    
    @Override
    public String getColor() {
        return "Orange";
    }
    
    @Override
    public String getTaste() {
        return "Sweet and Tangy";
    }
}