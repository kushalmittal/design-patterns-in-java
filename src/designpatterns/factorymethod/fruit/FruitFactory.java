package designpatterns.factorymethod.fruit;

/**
 * Abstract Factory class for the Factory Method Pattern.
 * 
 * DIFFERENCE FROM FACTORY PATTERN:
 * In the Factory Pattern, we had a single concrete factory class (FruitFactory) with a method
 * that created different products based on a parameter.
 * 
 * In the Factory Method Pattern, we have an abstract factory class (this class) that defines
 * a factory method (createFruit) which is implemented by concrete factory subclasses.
 * Each concrete factory is responsible for creating a specific type of product.
 * 
 * This approach:
 * 1. Follows the "Open/Closed Principle" better - to add a new fruit type, we just add a new
 *    concrete factory class without modifying existing code
 * 2. Gives more flexibility in how each product is created
 * 3. Allows for more complex initialization logic specific to each product type
 */
public abstract class FruitFactory {
    
    /**
     * This is the factory method that concrete subclasses must implement.
     * It creates and returns a Fruit object.
     * 
     * @return a new Fruit instance
     */
    public abstract Fruit createFruit();
    
    /**
     * This method uses the factory method to create a fruit and then displays its properties.
     * It demonstrates how the factory method is typically used within the creator class.
     */
    public void displayFruitInfo() {
        // Create the fruit using the factory method
        Fruit fruit = createFruit();
        
        // Display information about the fruit
        System.out.println("Fruit: " + fruit.getName());
        System.out.println("Color: " + fruit.getColor());
        System.out.println("Taste: " + fruit.getTaste());
        System.out.println();
    }
}