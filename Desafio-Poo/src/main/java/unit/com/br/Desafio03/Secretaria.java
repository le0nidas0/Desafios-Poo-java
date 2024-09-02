package unit.com.br.Desafio03;

public class Secretaria extends Funcionario{
    private String ramal;

    public Secretaria(String nome, double salario, int codigoId, String ramal) {
        super(nome, salario, codigoId);
        this.ramal = ramal;

    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Ramal: " +ramal);
    }
}
