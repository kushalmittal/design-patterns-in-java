package designpatterns.abstractfactory.fruit.temperate;

import designpatterns.abstractfactory.fruit.Juice;

/**
 * Concrete implementation of the Juice interface for Temperate Apple Juice.
 * 
 * This is a concrete product in the Abstract Factory pattern, belonging to the
 * "Temperate" product family.
 */
public class TemperateAppleJuice implements Juice {
    
    @Override
    public String getName() {
        return "Temperate Apple Juice";
    }
    
    @Override
    public String getColor() {
        return "Amber";
    }
    
    @Override
    public String getTaste() {
        return "Crisp and Slightly Tart";
    }
    
    @Override
    public String getSourceFruit() {
        return "Temperate Apple";
    }
    
    @Override
    public String getClimate() {
        return "Temperate";
    }
}