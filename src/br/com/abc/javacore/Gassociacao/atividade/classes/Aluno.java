package br.com.abc.javacore.Gassociacao.atividade.classes;

public class Aluno extends Pessoa implements Cadastro {
    private int idade;
    private Seminario nomeDaPelastra;

    public Aluno(String nome, int idade, Seminario nomeDaPelastra){
        this.setNome(nome);
        this.idade = idade;
        this.nomeDaPelastra = nomeDaPelastra;
    }

    public Seminario getNomeDaPelastra() {
        return nomeDaPelastra;
    }
    public void setNomeDaPelastra(Seminario nomeDaPelastra) {
        this.nomeDaPelastra = nomeDaPelastra;
    }

   public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public void cadastrar() {
        System.out.println("O aluno se cadastra no seminário");
    }
}
