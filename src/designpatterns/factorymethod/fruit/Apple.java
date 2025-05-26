package designpatterns.factorymethod.fruit;

/**
 * Concrete implementation of the Fruit interface for Apple.
 * 
 * This class is similar to the one used in the Factory Pattern example,
 * as both patterns use the same concrete product classes.
 */
public class Apple implements Fruit {
    
    @Override
    public String getName() {
        return "Apple";
    }
    
    @Override
    public String getColor() {
        return "Red";
    }
    
    @Override
    public String getTaste() {
        return "Sweet and Crisp";
    }
}