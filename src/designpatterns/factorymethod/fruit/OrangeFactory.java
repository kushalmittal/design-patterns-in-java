package designpatterns.factorymethod.fruit;

/**
 * Concrete Factory class for creating Orange objects.
 * 
 * DIFFERENCE FROM FACTORY PATTERN:
 * In the Factory Pattern, a single factory class would handle creating all types of fruits.
 * In the Factory Method Pattern, we have a separate factory class for each product type.
 * 
 * This concrete factory is specialized in creating only Orange objects.
 * If we need to change how Oranges are created (e.g., different varieties of oranges),
 * we only need to modify this class without affecting other fruit creation.
 */
public class OrangeFactory extends FruitFactory {
    
    /**
     * Implementation of the factory method that creates and returns an Orange.
     * 
     * @return a new Orange instance
     */
    @Override
    public Fruit createFruit() {
        // Here we could add complex initialization logic specific to Oranges if needed
        return new Orange();
    }
}