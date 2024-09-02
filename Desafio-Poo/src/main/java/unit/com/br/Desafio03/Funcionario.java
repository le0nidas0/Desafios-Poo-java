package unit.com.br.Desafio03;

public class Funcionario {
    private String nome;
    private double salario;
    private int codigoId;

    public Funcionario(String nome, double salario, int codigoId) {
        this.nome = nome;
        this.salario = salario;
        this.codigoId = codigoId;
    }

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

    public int getCodigoId() {
        return codigoId;
    }

    public void setCodigoId(int codigoId) {
        this.codigoId = codigoId;
    }

    public double calcularBonificacao() {
        return salario * 0.10;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " +salario);
        System.out.println("Bonificacao: " +calcularBonificacao());
        System.out.println("Codigo de identificacao: " +codigoId);
    }




}
