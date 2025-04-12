package solidPrinciples.openClosed.right;

import solidPrinciples.openClosed.right.services.CreditService;
import solidPrinciples.openClosed.right.services.MercadoPagoService;
import solidPrinciples.openClosed.right.services.PaymentService;

public class Main {

    public static void main(String[] args) {
        CreditService cs = new CreditService();
        MercadoPagoService ms = new MercadoPagoService();
        PaymentService p = new PaymentService();

        Double valor = Double.valueOf("1000.00");

        p.makePayment(cs, valor);
        p.makePayment(ms, valor);
    }
}
