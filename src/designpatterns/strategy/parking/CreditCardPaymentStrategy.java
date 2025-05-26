package designpatterns.strategy.parking;

/**
 * Concrete implementation of the PaymentStrategy interface for credit card payments.
 * 
 * In the Strategy Pattern, this class represents a concrete strategy that implements
 * the algorithm for processing credit card payments.
 * 
 * STRATEGY PATTERN IMPLEMENTATION:
 * This class encapsulates the specific algorithm for making payments via credit card.
 * It can be swapped with other payment strategies at runtime without affecting the client code.
 */
public class CreditCardPaymentStrategy implements PaymentStrategy {
    
    private String cardNumber;
    private String name;
    private String expiryDate;
    private String cvv;
    
    /**
     * Constructor that initializes the credit card details.
     * 
     * @param cardNumber the credit card number
     * @param name the name on the credit card
     * @param expiryDate the expiry date of the credit card
     * @param cvv the CVV code of the credit card
     */
    public CreditCardPaymentStrategy(String cardNumber, String name, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }
    
    @Override
    public String pay(double amount) {
        // Algorithm specific to credit card payment
        String maskedCardNumber = "xxxx-xxxx-xxxx-" + cardNumber.substring(cardNumber.length() - 4);
        return String.format("Paid $%.2f using Credit Card %s (cardholder: %s)", 
                amount, maskedCardNumber, name);
    }
}