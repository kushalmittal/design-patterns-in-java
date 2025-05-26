package strategy.parking;

/**
 * Context class for the Strategy Pattern implementation.
 * 
 * STRATEGY PATTERN IMPLEMENTATION:
 * This class represents the Context in the Strategy Pattern. It:
 * 1. Maintains a reference to a Strategy object
 * 2. Allows changing the Strategy object at runtime
 * 3. Delegates the algorithm execution to the Strategy object
 * 
 * CONTEXT RESPONSIBILITIES:
 * - The Context doesn't implement the payment algorithm itself
 * - It delegates the payment processing to the concrete Strategy
 * - It provides an interface for the client to interact with the Strategy
 * 
 * RUNTIME STRATEGY SWITCHING:
 * A key benefit of the Strategy Pattern is the ability to switch algorithms at runtime.
 * This class provides a setPaymentStrategy() method to change the payment method dynamically.
 */
public class ParkingLot {
    
    // Reference to the current payment strategy
    private PaymentStrategy paymentStrategy;
    
    // Parking details
    private String vehicleNumber;
    private int hoursParked;
    private double hourlyRate;
    
    /**
     * Constructor that initializes the parking details.
     * 
     * @param vehicleNumber the vehicle's license plate number
     * @param hoursParked the number of hours the vehicle was parked
     * @param hourlyRate the hourly rate for parking
     */
    public ParkingLot(String vehicleNumber, int hoursParked, double hourlyRate) {
        this.vehicleNumber = vehicleNumber;
        this.hoursParked = hoursParked;
        this.hourlyRate = hourlyRate;
    }
    
    /**
     * Set the strategy to use for processing the payment.
     * This method allows changing the payment method at runtime.
     * 
     * @param paymentStrategy the payment strategy to use
     */
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    
    /**
     * Calculate the parking fee based on hours parked and hourly rate.
     * 
     * @return the calculated parking fee
     */
    public double calculateParkingFee() {
        return hoursParked * hourlyRate;
    }
    
    /**
     * Process the payment using the current payment strategy.
     * 
     * @return the result of processing the payment
     * @throws IllegalStateException if no payment strategy has been set
     */
    public String processPayment() {
        if (paymentStrategy == null) {
            throw new IllegalStateException("No payment strategy has been set");
        }
        
        double amount = calculateParkingFee();
        String paymentResult = paymentStrategy.pay(amount);
        
        return String.format("Vehicle %s parked for %d hours. %s", 
                vehicleNumber, hoursParked, paymentResult);
    }
}