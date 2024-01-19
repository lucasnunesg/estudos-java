package interfaces2.model.services;

import interfaces2.model.entities.Contract;
import interfaces2.model.entities.Installment;

public class ContractService {

    public void processContract(Contract contract, int months, OnlinePaymentService onlinePaymentService){
        for (int i = 1; i <= months; i++) {
            double installmentBaseValue = contract.getTotalValue() / months;
            double installmentValueWithInterest = installmentBaseValue +
                    onlinePaymentService.interest(installmentBaseValue, i);
            double installmentTotalValue = installmentValueWithInterest +
                    onlinePaymentService.paymentFee(installmentValueWithInterest);

            Installment installment = new Installment(
                    contract.getDate().plusMonths(i), installmentTotalValue
            );

            contract.getInstallments().add(installment);
        }
    }
}
