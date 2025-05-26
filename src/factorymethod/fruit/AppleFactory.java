package factorymethod.fruit;

/**
 * Concrete Factory class for creating Apple objects.
 * 
 * DIFFERENCE FROM FACTORY PATTERN:
 * In the Factory Pattern, a single factory class would handle creating all types of fruits.
 * In the Factory Method Pattern, we have a separate factory class for each product type.
 * 
 * This concrete factory is specialized in creating only Apple objects.
 * If we need to change how Apples are created (e.g., different varieties of apples),
 * we only need to modify this class without affecting other fruit creation.
 */
public class AppleFactory extends FruitFactory {
    
    /**
     * Implementation of the factory method that creates and returns an Apple.
     * 
     * @return a new Apple instance
     */
    @Override
    public Fruit createFruit() {
        // Here we could add complex initialization logic specific to Apples if needed
        return new Apple();
    }
}