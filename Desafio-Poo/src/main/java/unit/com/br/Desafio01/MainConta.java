package unit.com.br.Desafio01;

public class MainConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente= new ContaCorrente(2000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000.0);

        System.out.println("O saldo inicial da conta corrente e de R$" +contaCorrente.getSaldo());
        System.out.println("O saldo inicial da conta pupanca e de R$" +contaPoupanca.getSaldo());

        contaCorrente.depositar(300.0);
        contaPoupanca.depositar(300.0);

        contaCorrente.atualiza(5.0);
        contaPoupanca.atualiza(5.0);

        System.out.println("Saldo final Conta Corrente: R$" + contaCorrente.getSaldo());
        System.out.println("Saldo final Conta Poupança: R$" + contaPoupanca.getSaldo());
    }
}
