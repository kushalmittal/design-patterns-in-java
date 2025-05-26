package designpatterns.strategy;

import designpatterns.strategy.parking.*;

/**
 * Demo class to demonstrate the Strategy Pattern using a parking lot example.
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        // Create a parking lot with a vehicle that parked for 3 hours at $2.50 per hour
        ParkingLot parkingLot = new ParkingLot("ABC123", 3, 2.50);

        System.out.println("STRATEGY PATTERN DEMONSTRATION WITH PARKING LOT PAYMENTS");
        System.out.println("=======================================================");

        // Use the credit card payment strategy
        System.out.println("\nUsing Credit Card Payment Strategy:");
        parkingLot.setPaymentStrategy(new CreditCardPaymentStrategy(
                "1234567890123456", "John Doe", "12/25", "123"));
        System.out.println(parkingLot.processPayment());

        // Switch to the cash payment strategy
        System.out.println("\nSwitching to Cash Payment Strategy:");
        parkingLot.setPaymentStrategy(new CashPaymentStrategy());
        System.out.println(parkingLot.processPayment());

        // Switch to the mobile payment strategy
        System.out.println("\nSwitching to Mobile Payment Strategy:");
        parkingLot.setPaymentStrategy(new MobilePaymentStrategy("PayApp", "1234567890"));
        System.out.println(parkingLot.processPayment());

        // Create another parking lot with a different vehicle
        ParkingLot anotherParkingLot = new ParkingLot("XYZ789", 5, 3.00);

        System.out.println("\nUsing different strategies with another vehicle:");

        // Use the credit card payment strategy with another vehicle
        anotherParkingLot.setPaymentStrategy(new CreditCardPaymentStrategy(
                "9876543210987654", "Jane Smith", "06/24", "456"));
        System.out.println("Credit Card Strategy: " + anotherParkingLot.processPayment());

        // Use the mobile payment strategy with another vehicle
        anotherParkingLot.setPaymentStrategy(new MobilePaymentStrategy("MobilePay", "9876543210"));
        System.out.println("Mobile Payment Strategy: " + anotherParkingLot.processPayment());

    }
}
