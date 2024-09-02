package unit.com.br.Desafio03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ControlePonto {

    LocalDateTime dataHoraAtual = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String dataHoraFormatada = dataHoraAtual.format(formatter);

    public void controleEntrada(Funcionario f) {
        System.out.println(f.getNome() + " Registrou entrada as: " +dataHoraFormatada);
    }

    public void controleSaida(Funcionario f) {
        System.out.println(f.getNome() + " Registrou saida as: " +dataHoraFormatada);
    }
}
