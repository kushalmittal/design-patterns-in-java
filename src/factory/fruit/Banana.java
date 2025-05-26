package factory.fruit;

/**
 * Concrete implementation of the Fruit interface for Banana.
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