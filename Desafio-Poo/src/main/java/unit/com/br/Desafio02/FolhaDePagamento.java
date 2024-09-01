package unit.com.br.Desafio02;

import java.util.Scanner;

public class FolhaDePagamento {

    public static double calcularFolhar(Empregado emp){
        double salarioTotal = emp.definirSalario();
        salarioTotal = emp.definirBeneficios(salarioTotal);

        return salarioTotal;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FolhaDePagamento pagamento = new FolhaDePagamento();
        Empregado emp = null;

        while (true){
            System.out.println("\nMenu de Opções:");
            System.out.println("1 - Programador");
            System.out.println("2 - Gerente");
            System.out.println("3 - Analista");
            System.out.println("4 - Fim");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    emp = new Programador();
                    break;
                case 2:
                    emp = new Gerente();
                    break;
                case 3:
                    emp = new Analista();
                    break;
                case 4:
                    System.out.println("Fim do programa. ");
                    return;
                default:
                    System.out.println("Opcao invalida");
                    continue;
            }

            if (emp != null) {
                double salarioFinal = pagamento.calcularFolhar(emp);
                System.out.printf("O salário final é: R$ %.2f%n", salarioFinal);
            }
        }
    }


}
