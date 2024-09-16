package unit.com.br.Desafio07;

import java.util.Scanner;

public class ContaCorrente {
    private double saldo = 0;

    public double getSaldo() {
        return saldo;
    }

    public void creditar(double saldo) {
        this.saldo = saldo;
    }

    public void exibir() {
        System.out.println(getSaldo());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente cliente1 = new ContaCorrente();
        ContaCorrente cliente2 = new ContaCorrente();
        cliente1.creditar(1000);

        System.out.println("valor a ser creditado na conta 2: ");
        double credito = scanner.nextDouble();

        cliente2.creditar(credito);

        cliente1.exibir();
        cliente2.exibir();





    }
}
