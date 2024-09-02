package unit.com.br.Desafio03;

public class Gerente extends Funcionario{
    private String nomeGerente;
    private String senha;

    public Gerente(String nome, double salario, int codigoId, String nomeGerente, String senha) {
        super(nome, salario, codigoId);
        this.nomeGerente = nomeGerente;
        this.senha = senha;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public double calcularBonificacao() {
        return getSalario() * 0.60;
    }

        public void exibirDados() {
        super.exibirDados();
        System.out.println("Nome do Gerente: " +nomeGerente);
    }
}
