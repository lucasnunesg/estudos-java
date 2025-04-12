package solidPrinciples.openClosed.right.services;

public class CreditService implements PaymentInterface {
    private void processPayment() {
        System.out.println("Processing payment in Credits");
    }

    @Override
    public void pay(Double value) {
        processPayment();
    }
}
