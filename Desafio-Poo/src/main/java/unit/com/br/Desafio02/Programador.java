package unit.com.br.Desafio02;

import java.util.Scanner;

public class Programador extends Empregado{

    @Override
    public double definirBeneficios(double salarioTotal) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de sua produtividade; ");
        double produtividade = scanner.nextDouble();

        salarioTotal += (salarioTotal * produtividade) / 100;
        return salarioTotal;
    }
}
