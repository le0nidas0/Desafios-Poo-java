package unit.com.br.Desafio06;

import java.util.Scanner;

public class Medida {
    private int metro;
    private int centimetro;

    public void setMedida(int metro, int centimetro){
        this.metro = metro;
        this.centimetro = centimetro;
    }

    public void getMedida() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a medida de metros: ");
        this.metro = scanner.nextInt();

        System.out.println("Digite a medida de centimetros: ");
        this.centimetro = scanner.nextInt();
    }

    public void mostrarDados(){
        System.out.println("A medida de metros e: " +metro);
        System.out.println("A medida de centimetros e: " +centimetro);
    }

    public static void main(String[] args) {
        Medida medida1 = new Medida();
        medida1.setMedida(50,34);

        Medida medida2 = new Medida();
        medida2.setMedida(32, 87);

        medida1.mostrarDados();
        medida2.mostrarDados();
    }
}
