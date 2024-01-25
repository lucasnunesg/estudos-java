package dependencyInjection.setterInjection;

public class Program {
    public static void main(String[] args) {

        PayService payService = new PayService();

        payService.setDeductionService(new PayPalDeductionService());

        double tax = payService.tax(1000.00);

        System.out.println(tax);
    }
}
