package unit.com.br.Desafio03;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Marcos", 2000.0, 1, "Marcus pietro", "12345678");
        Secretaria secretaria = new Secretaria("Rosangela", 1500.0, 2, "79" );

        ControlePonto controlePonto = new ControlePonto();


        controlePonto.controleEntrada(gerente);
        controlePonto.controleEntrada(secretaria);

        gerente.exibirDados();
        secretaria.exibirDados();

        controlePonto.controleSaida(gerente);
        controlePonto.controleSaida(secretaria);

    }
}
