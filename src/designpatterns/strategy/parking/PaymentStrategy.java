package designpatterns.strategy.parking;

/**
 * Strategy interface for the Strategy Pattern implementation.
 * 
 * STRATEGY PATTERN EXPLANATION:
 * The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them
 * interchangeable. It lets the algorithm vary independently from clients that use it.
 * 
 * In this parking lot example, the PaymentStrategy interface defines the contract for different
 * payment methods (algorithms) that can be used to pay for parking.
 * 
 * KEY COMPONENTS:
 * 1. Strategy Interface (this interface): Defines the contract for all concrete strategies
 * 2. Concrete Strategies: Implement the algorithm defined by the Strategy interface
 * 3. Context: Uses a Strategy object and maintains a reference to it
 * 
 * DIFFERENCES FROM OTHER PATTERNS:
 * - Factory Pattern: Creates objects without specifying the exact class, while Strategy Pattern
 *   defines a family of interchangeable algorithms
 * - Factory Method: Defines an interface for creating objects, but lets subclasses decide which
 *   class to instantiate, while Strategy Pattern focuses on behavior encapsulation
 * - Decorator: Adds responsibilities to objects dynamically, while Strategy Pattern
 *   encapsulates different ways to perform a task
 * 
 * BENEFITS:
 * - Eliminates conditional statements for payment method selection
 * - Provides different implementations of the same behavior (payment processing)
 * - Allows for runtime switching between different payment methods
 */
public interface PaymentStrategy {
    
    /**
     * Process a payment for parking.
     * 
     * @param amount the amount to pay
     * @return a string describing the result of the payment
     */
    String pay(double amount);
}