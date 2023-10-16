package polymorphism.taxes.entities;

public class Company extends TaxPayer{

    private int numberOfEmployees;

    public Company() {
        super();
    }


    public Company(String name, Double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double calculateTax() {
        Double taxPercentage;
        if(this.getNumberOfEmployees() > 10){
            taxPercentage = 0.14;
        } else {
            taxPercentage = 0.16;
        }
        return this.getAnnualIncome() * taxPercentage;
    }


}
