package unit.com.br.Desafio03;

public class Gerente extends Funcionarios{
    private String nome;
    private String senha;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void calcularBonificacao(double salario) {
        double bonificacao = (salario * 0.60);
    }


}
