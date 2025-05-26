package factory.fruit;

/**
 * Factory class for creating different types of fruits.
 * This is an implementation of the Factory Pattern.
 */
public class FruitFactory {
    
    /**
     * Creates and returns a fruit of the specified type.
     * 
     * @param fruitType the type of fruit to create
     * @return a new instance of the specified fruit type, or null if the type is not supported
     */
    public Fruit createFruit(String fruitType) {
        if (fruitType == null) {
            return null;
        }
        
        if (fruitType.equalsIgnoreCase("APPLE")) {
            return new Apple();
        } else if (fruitType.equalsIgnoreCase("ORANGE")) {
            return new Orange();
        } else if (fruitType.equalsIgnoreCase("BANANA")) {
            return new Banana();
        }
        
        return null;
    }
}