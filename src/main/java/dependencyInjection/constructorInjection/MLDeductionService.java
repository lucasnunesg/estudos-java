package dependencyInjection.constructorInjection;

public class MLDeductionService implements DeductionService {

    @Override
    public double deduction(double amount) {
        return amount * 0.15;
    }
}
