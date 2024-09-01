package unit.com.br.Desafio01;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }
    
    @Override
    public void atualiza(double taxa) {
        saldo *= (1 + 3 * taxa /100);
    }
}
