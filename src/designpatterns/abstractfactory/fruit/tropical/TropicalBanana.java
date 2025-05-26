package designpatterns.abstractfactory.fruit.tropical;

import designpatterns.abstractfactory.fruit.Fruit;

/**
 * Concrete implementation of the Fruit interface for a Tropical Banana.
 * 
 * This is a concrete product in the Abstract Factory pattern, belonging to the
 * "Tropical" product family.
 */
public class TropicalBanana implements Fruit {
    
    @Override
    public String getName() {
        return "Tropical Banana";
    }
    
    @Override
    public String getColor() {
        return "Bright Yellow";
    }
    
    @Override
    public String getTaste() {
        return "Sweet and Creamy";
    }
    
    @Override
    public String getClimate() {
        return "Tropical";
    }
}