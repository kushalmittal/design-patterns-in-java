package designpatterns.factorymethod.fruit;

/**
 * Concrete implementation of the Fruit interface for Banana.
 * 
 * This class is similar to the one used in the Factory Pattern example,
 * as both patterns use the same concrete product classes.
 */
public class Banana implements Fruit {
    
    @Override
    public String getName() {
        return "Banana";
    }
    
    @Override
    public String getColor() {
        return "Yellow";
    }
    
    @Override
    public String getTaste() {
        return "Sweet and Soft";
    }
}