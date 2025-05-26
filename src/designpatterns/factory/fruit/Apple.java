package designpatterns.factory.fruit;

/**
 * Concrete implementation of the Fruit interface for Apple.
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