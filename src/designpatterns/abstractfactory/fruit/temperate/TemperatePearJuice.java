package designpatterns.abstractfactory.fruit.temperate;

import designpatterns.abstractfactory.fruit.Juice;

/**
 * Concrete implementation of the Juice interface for Temperate Pear Juice.
 * 
 * This is a concrete product in the Abstract Factory pattern, belonging to the
 * "Temperate" product family.
 */
public class TemperatePearJuice implements Juice {
    
    @Override
    public String getName() {
        return "Temperate Pear Juice";
    }
    
    @Override
    public String getColor() {
        return "Light Green";
    }
    
    @Override
    public String getTaste() {
        return "Sweet and Mild";
    }
    
    @Override
    public String getSourceFruit() {
        return "Temperate Pear";
    }
    
    @Override
    public String getClimate() {
        return "Temperate";
    }
}