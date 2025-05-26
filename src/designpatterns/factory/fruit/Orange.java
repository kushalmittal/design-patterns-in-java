package designpatterns.factory.fruit;

/**
 * Concrete implementation of the Fruit interface for Orange.
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