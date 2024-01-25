package dependencyInjection.interfaceInjection;

public class PayService {

    /*
    Baixo acoplamento, pois o controle para instanciar a dependência fica fora da PayService (inversão de controle)

    Fica sob responsabilidade do programa principal especificar qual o deductionService passar para o PayService,
    sendo que o único requisito é que seja uma implementação da classe DeductionService e cumpra seu contrato.
     */
    public PayService(){};

    public double tax(double amount, DeductionService deductionService) {
        amount = amount - deductionService.deduction(amount);
        return amount * 0.2;
    }
}
