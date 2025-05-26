package designpatterns.factorymethod.fruit;

/**
 * Concrete Factory class for creating Banana objects.
 * 
 * DIFFERENCE FROM FACTORY PATTERN:
 * In the Factory Pattern, a single factory class would handle creating all types of fruits.
 * In the Factory Method Pattern, we have a separate factory class for each product type.
 * 
 * This concrete factory is specialized in creating only Banana objects.
 * If we need to change how Bananas are created (e.g., different varieties of bananas),
 * we only need to modify this class without affecting other fruit creation.
 */
public class BananaFactory extends FruitFactory {
    
    /**
     * Implementation of the factory method that creates and returns a Banana.
     * 
     * @return a new Banana instance
     */
    @Override
    public Fruit createFruit() {
        // Here we could add complex initialization logic specific to Bananas if needed
        return new Banana();
    }
}