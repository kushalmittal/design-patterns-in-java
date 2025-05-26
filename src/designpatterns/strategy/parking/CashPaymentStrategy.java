package designpatterns.strategy.parking;

/**
 * Concrete implementation of the PaymentStrategy interface for cash payments.
 * 
 * In the Strategy Pattern, this class represents a concrete strategy that implements
 * the algorithm for processing cash payments.
 * 
 * STRATEGY PATTERN IMPLEMENTATION:
 * This class encapsulates the specific algorithm for making payments via cash.
 * It can be swapped with other payment strategies at runtime without affecting the client code.
 */
public class CashPaymentStrategy implements PaymentStrategy {
    
    @Override
    public String pay(double amount) {
        // Algorithm specific to cash payment
        return String.format("Paid $%.2f in cash at the parking booth", amount);
    }
}