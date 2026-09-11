// Abstract class defines the contract for all payments
abstract class Payment {
    public abstract void processPayment(double amount);

    public abstract void generateReceipt();
}

// Credit Card Payment Implementation
class CreditCardPayment extends Payment {
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of Rs "
                + amount + " using Card Number: " + cardNumber);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Credit Card Payment Receipt Generated.");
    }
}

// UPI Payment Implementation
class UpiPayment extends Payment {
    private final String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of Rs "
                + amount + " using UPI ID: " + upiId);
    }

    @Override
    public void generateReceipt() {
        System.out.println("UPI Payment Receipt Generated.");
    }
}

// Net Banking Payment Implementation
class NetBankingPayment extends Payment {
    private final String userId;

    public NetBankingPayment(String userId) {
        this.userId = userId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Net Banking Payment of Rs "
                + amount + " for User ID: " + userId);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Net Banking Payment Receipt Generated.");
    }
}

public class Paymet_Getway {

    public static void main(String[] args) {

    }
}