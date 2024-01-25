package dependencyInjection.interfaceInjection;

public class Program {
    public static void main(String[] args) {

        PayService payService = new PayService();

        double tax = payService.tax(1000.00, new PayPalDeductionService());

        System.out.println(tax);
    }
}
