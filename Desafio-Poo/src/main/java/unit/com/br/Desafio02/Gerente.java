package unit.com.br.Desafio02;

import java.util.Scanner;

public class Gerente extends Empregado{

    @Override
    public double definirBeneficios(double salarioTotal){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do bonus: ");
        double bonus = scanner.nextDouble();

        salarioTotal += bonus;

        return salarioTotal;
    }
}
