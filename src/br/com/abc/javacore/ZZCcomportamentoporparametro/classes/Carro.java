package br.com.abc.javacore.ZZCcomportamentoporparametro.classes;
/*
A boa pr�tica de passar comportamento por meio de par�metros
Tr�s certezas na vida
* vai pagar imposto
* vai morrer
* o cliente vai mudar os requisitos do sistema
 */
public class Carro {
    private String nome = "Gol";
    private String cor;
    private int ano;

    public Carro(String cor, int ano) {
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


}
