package strategy.parking;

/**
 * Concrete implementation of the PaymentStrategy interface for mobile payments.
 * 
 * In the Strategy Pattern, this class represents a concrete strategy that implements
 * the algorithm for processing mobile payments.
 * 
 * STRATEGY PATTERN IMPLEMENTATION:
 * This class encapsulates the specific algorithm for making payments via mobile apps.
 * It can be swapped with other payment strategies at runtime without affecting the client code.
 */
public class MobilePaymentStrategy implements PaymentStrategy {
    
    private String appName;
    private String phoneNumber;
    
    /**
     * Constructor that initializes the mobile payment details.
     * 
     * @param appName the name of the mobile payment app
     * @param phoneNumber the phone number associated with the mobile payment
     */
    public MobilePaymentStrategy(String appName, String phoneNumber) {
        this.appName = appName;
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String pay(double amount) {
        // Algorithm specific to mobile payment
        String maskedPhoneNumber = "xxx-xxx-" + phoneNumber.substring(phoneNumber.length() - 4);
        return String.format("Paid $%.2f using %s mobile app (phone: %s)", 
                amount, appName, maskedPhoneNumber);
    }
}