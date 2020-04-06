package br.com.abc.javacore.associacao.atividade.classes;

public class Professor extends Pessoa implements Cadastro {
    private String titulacao;
    private Seminario [] seminarios;

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }



    @Override
    public void cadastrar(){
        System.out.println("O professor de cadastra para o seminário");
    }

}
