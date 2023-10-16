package polymorphism.taxes.entities;

public class Individual extends TaxPayer{

    private Double healthExpenses;

    public Individual(){
        super();
    }

    public Individual(String name, Double annualIncome, Double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public Double calculateTax() {
        Double taxPercentage;
        if(this.getAnnualIncome() < 20000){
            taxPercentage = 0.15;
        } else {
            taxPercentage = 0.25;
        }
        return(this.getAnnualIncome() * taxPercentage - this.getHealthExpenses() * 0.5);
    }
}
