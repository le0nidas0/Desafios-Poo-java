package unit.com.br.Desafio02;

import java.util.Scanner;

public class Empregado {
    protected double salario;

    public double definirSalario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do salário: ");
        salario = scanner.nextDouble();

        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public double definirBeneficios(double salarioTotal) {
        return 0;
    }


}


