package dependencyInjection.noInjection;

public class PayPalDeductionService implements DeductionService{

    @Override
    public double deduction(double amount) {
        return amount * 0.12;
    }
}
