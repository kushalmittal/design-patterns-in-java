package abstractfactory.fruit.tropical;

import abstractfactory.fruit.Juice;

/**
 * Concrete implementation of the Juice interface for Tropical Apple Juice.
 * 
 * This is a concrete product in the Abstract Factory pattern, belonging to the
 * "Tropical" product family.
 */
public class TropicalAppleJuice implements Juice {
    
    @Override
    public String getName() {
        return "Tropical Apple Juice";
    }
    
    @Override
    public String getColor() {
        return "Deep Red";
    }
    
    @Override
    public String getTaste() {
        return "Sweet and Refreshing";
    }
    
    @Override
    public String getSourceFruit() {
        return "Tropical Apple";
    }
    
    @Override
    public String getClimate() {
        return "Tropical";
    }
}