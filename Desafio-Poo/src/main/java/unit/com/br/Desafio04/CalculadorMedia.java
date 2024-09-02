package unit.com.br.Desafio04;

import java.util.Scanner;

public class CalculadorMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite sua nota em Matemática e suas Tecnologias: ");
        int notaMate = scanner.nextInt();

        System.out.println("Digite sua nota em Ciências Humanas e suas Tecnologias: ");
        int notaHumanas = scanner.nextInt();

        System.out.println("Digite sua nota em Ciências da Natureza e suas Tecnologias: ");
        int notaNatureza = scanner.nextInt();

        System.out.println("Digite sua nota em Linguagens, Códigos e suas Tecnologias: ");
        int notaLinguagem = scanner.nextInt();

        double notaTotal = notaLinguagem + notaHumanas + notaNatureza +notaMate;
        if (notaMate < 60){
            System.out.println("Nota total foi de "+notaTotal +" Candidato reprovado");

        } else if (notaHumanas < 50) {
            System.out.println("Nota total foi de "+notaTotal +" Candidato Reprovado");
        }else if (notaNatureza < 55) {
            System.out.println("Nota total foi de "+notaTotal +" Candidato Reprovado");
        }else if (notaLinguagem < 65) {
            System.out.println("Nota total foi de "+notaTotal + " Candidato Reprovado");
        }
        else {
            System.out.println("Nota total foi de "+notaTotal +" Candidato Aprovado");
        }


    }
}
