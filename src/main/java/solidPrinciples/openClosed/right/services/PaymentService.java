package solidPrinciples.openClosed.right.services;


public class PaymentService {

    public void makePayment (PaymentInterface service, Double valor) {
        service.pay(valor);
    }
}
