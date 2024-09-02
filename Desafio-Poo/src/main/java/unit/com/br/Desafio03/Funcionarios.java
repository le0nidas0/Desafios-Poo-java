package unit.com.br.Desafio03;

public abstract class Funcionarios {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularBonificacao(double salario) {
        double bonificacao = (salario * 0.10);
    }

    public static void exibirDados() {
        System.out.println("");

    }
}
