package unit.com.br.Desafio02;

import java.util.Scanner;

public class Analista extends Empregado{

    @Override
    public double definirBeneficios(double salarioTotal){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi o valor da economia no projeto: ");
        double economia = scanner.nextDouble();

        salarioTotal = salarioTotal + (0.10 * economia);
        return salarioTotal;
    }
}
