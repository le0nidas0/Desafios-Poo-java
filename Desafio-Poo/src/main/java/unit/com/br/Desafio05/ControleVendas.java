package unit.com.br.Desafio05;

import java.util.Scanner;

public class ControleVendas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas blusas deseja comprar? ");
        int quantidade = scanner.nextInt();

        if (quantidade >= 10) {
            int total = quantidade *100;
            System.out.println("O valor da compra vai ser R$" +total);
        }
        else {
            double total2 = quantidade * 110;
            System.out.println("O valor da compra vai ser R$" +total2);
        }
    }
}
