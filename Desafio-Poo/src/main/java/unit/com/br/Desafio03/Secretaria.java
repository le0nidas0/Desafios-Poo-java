package unit.com.br.Desafio03;

public class Secretaria extends Funcionarios{
    private String ramal;

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    @Override
    public void calcularBonificacao(double salario) {
        double bonificacao= (salario * 0.10);
    }
}
