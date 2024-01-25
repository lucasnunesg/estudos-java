package dependencyInjection.noInjection;

public class PayService {

    /*
    Alto acoplamento gerado pois dentro do próprio serviço de pagamento estou instanciando o MLDeductionService.

    Caso seja necessário trocar o serviço de dedução do MercadoLivre para outro seria necessário alterar em todos os
        lugares onde o mesmo é instanciado e recompilar todas as classes
     */

    private DeductionService deductionService = new MLDeductionService();

    public double tax(double amount){
        amount = amount - deductionService.deduction(amount);
        return amount * 0.2;
    }
}
