package solidPrinciples.openClosed.right.services;

public class MercadoPagoService implements PaymentInterface {
    private void processPayment() {
        System.out.println("Processing payment in MercadoPago");
    }

    @Override
    public void pay(Double valor) {
        processPayment();
    }
}
