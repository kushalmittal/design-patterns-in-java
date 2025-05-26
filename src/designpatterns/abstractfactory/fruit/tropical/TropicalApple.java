package designpatterns.abstractfactory.fruit.tropical;

import designpatterns.abstractfactory.fruit.Fruit;

/**
 * Concrete implementation of the Fruit interface for a Tropical Apple.
 * 
 * This is a concrete product in the Abstract Factory pattern, belonging to the
 * "Tropical" product family.
 */
public class TropicalApple implements Fruit {
    
    @Override
    public String getName() {
        return "Tropical Apple";
    }
    
    @Override
    public String getColor() {
        return "Bright Red";
    }
    
    @Override
    public String getTaste() {
        return "Sweet and Tangy";
    }
    
    @Override
    public String getClimate() {
        return "Tropical";
    }
}