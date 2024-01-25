package dependencyInjection.constructorInjection;

public class Program {
    public static void main(String[] args) {

        PayService payService = new PayService(new PayPalDeductionService());

        double tax = payService.tax(1000.00);

        System.out.println(tax);
    }
}
