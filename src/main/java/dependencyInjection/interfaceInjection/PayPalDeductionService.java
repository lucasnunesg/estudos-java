package dependencyInjection.interfaceInjection;

public class PayPalDeductionService implements DeductionService {

    @Override
    public double deduction(double amount) {
        return amount * 0.12;
    }
}
