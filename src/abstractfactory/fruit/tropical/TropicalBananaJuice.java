package abstractfactory.fruit.tropical;

import abstractfactory.fruit.Juice;

/**
 * Concrete implementation of the Juice interface for Tropical Banana Juice.
 * 
 * This is a concrete product in the Abstract Factory pattern, belonging to the
 * "Tropical" product family.
 */
public class TropicalBananaJuice implements Juice {
    
    @Override
    public String getName() {
        return "Tropical Banana Juice";
    }
    
    @Override
    public String getColor() {
        return "Pale Yellow";
    }
    
    @Override
    public String getTaste() {
        return "Sweet and Smooth";
    }
    
    @Override
    public String getSourceFruit() {
        return "Tropical Banana";
    }
    
    @Override
    public String getClimate() {
        return "Tropical";
    }
}