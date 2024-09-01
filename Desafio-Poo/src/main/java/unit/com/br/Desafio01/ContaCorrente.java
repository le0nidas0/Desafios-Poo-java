package unit.com.br.Desafio01;

public class ContaCorrente extends Conta{

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void atualiza(double taxa){
         saldo *= (1 + 2 * taxa / 100);
    }
    
    @Override
    public void depositar(double valor){
        if (valor > 0) {
            saldo += (valor - 0.10);
            System.out.println("Deposito de R$ " +valor +" Taxado em R$0,10");
        }
        else {
            System.out.println("Deposito invalido");
        }
    }
}
