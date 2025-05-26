package decorator;

/**
 * DecoratorPatternDemo.java
 * 
 * This class demonstrates the Decorator design pattern using the coffee shop example.
 * 
 * The Decorator pattern allows behavior to be added to individual objects, either
 * statically or dynamically, without affecting the behavior of other objects from
 * the same class. It is a structural pattern that is used to extend the functionality
 * of objects in a flexible and reusable way.
 * 
 * Key components of the Decorator pattern:
 * 1. Component Interface (Coffee): Defines the interface for objects that can have
 *    responsibilities added to them dynamically.
 * 2. Concrete Component (SimpleCoffee, Espresso): Defines an object to which additional
 *    responsibilities can be attached.
 * 3. Decorator (CoffeeDecorator): Maintains a reference to a Component object and defines
 *    an interface that conforms to Component's interface.
 * 4. Concrete Decorators (MilkDecorator, SugarDecorator, WhippedCreamDecorator): Add
 *    responsibilities to the component.
 * 
 * Benefits of the Decorator pattern:
 * - More flexibility than static inheritance
 * - Avoids feature-laden classes high up in the hierarchy
 * - Enhances objects at runtime
 * - Combines behaviors by wrapping objects within other objects
 * 
 * Use cases:
 * - When you need to add responsibilities to objects dynamically and transparently
 * - When extension by subclassing is impractical
 * - When you want to add functionality to individual objects without affecting others
 */
public class DecoratorPatternDemo {
    /**
     * Main method to demonstrate the Decorator pattern.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a simple coffee
        System.out.println("=== Ordering a Simple Coffee ===");
        Coffee simpleCoffee = new SimpleCoffee();
        printCoffee(simpleCoffee);
        
        // Create an espresso
        System.out.println("\n=== Ordering an Espresso ===");
        Coffee espresso = new Espresso();
        printCoffee(espresso);
        
        // Decorate the simple coffee with milk
        System.out.println("\n=== Ordering a Simple Coffee with Milk ===");
        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        printCoffee(milkCoffee);
        
        // Decorate the espresso with sugar
        System.out.println("\n=== Ordering an Espresso with Sugar ===");
        Coffee sugarEspresso = new SugarDecorator(new Espresso());
        printCoffee(sugarEspresso);
        
        // Stack multiple decorators
        System.out.println("\n=== Ordering a Simple Coffee with Milk and Sugar ===");
        Coffee milkSugarCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        printCoffee(milkSugarCoffee);
        
        // Create a complex coffee with all decorators
        System.out.println("\n=== Ordering an Espresso with Milk, Sugar, and Whipped Cream ===");
        Coffee fancyCoffee = new WhippedCreamDecorator(
                                new SugarDecorator(
                                    new MilkDecorator(new Espresso())));
        printCoffee(fancyCoffee);
    }
    
    /**
     * Helper method to print coffee details.
     * 
     * @param coffee The coffee to print details for
     */
    private static void printCoffee(Coffee coffee) {
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());
    }
}