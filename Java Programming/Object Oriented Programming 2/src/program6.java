abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();
}

// Subclass: Credit Card Payment
class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(double amount, String cardNumber, String cardHolderName) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of $" + amount + " for " + cardHolderName);
    }
}

// Subclass: PayPal Payment
class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment of $" + amount + " for email: " + email);
    }
}



public class program6 {

    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment(150.00, "115588", "Kareem");
        Payment payPalPayment = new PayPalPayment(75.00, "kareem@example.com");

        creditCardPayment.processPayment();
        payPalPayment.processPayment();
    }
}
