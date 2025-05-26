package designpatterns.abstractfactory.fruit.temperate;

import designpatterns.abstractfactory.fruit.Fruit;

/**
 * Concrete implementation of the Fruit interface for a Temperate Apple.
 * 
 * This is a concrete product in the Abstract Factory pattern, belonging to the
 * "Temperate" product family.
 */
public class TemperateApple implements Fruit {
    
    @Override
    public String getName() {
        return "Temperate Apple";
    }
    
    @Override
    public String getColor() {
        return "Red with Green Patches";
    }
    
    @Override
    public String getTaste() {
        return "Crisp and Slightly Tart";
    }
    
    @Override
    public String getClimate() {
        return "Temperate";
    }
}