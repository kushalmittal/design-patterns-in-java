package designpatterns.abstractfactory.fruit.temperate;

import designpatterns.abstractfactory.fruit.Fruit;

/**
 * Concrete implementation of the Fruit interface for a Temperate Pear.
 * 
 * This is a concrete product in the Abstract Factory pattern, belonging to the
 * "Temperate" product family.
 */
public class TemperatePear implements Fruit {
    
    @Override
    public String getName() {
        return "Temperate Pear";
    }
    
    @Override
    public String getColor() {
        return "Green to Yellow";
    }
    
    @Override
    public String getTaste() {
        return "Sweet and Juicy";
    }
    
    @Override
    public String getClimate() {
        return "Temperate";
    }
}