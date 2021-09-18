package br.com.abc.javacore.ZZEOption.classes2;

public class Carro {
    //nosso carro se relaciona com uma seguradora
    private Seguradora seguradora;
    private String nome;

    //agora suponha que de dentro do carro você queira pegar o nome da seguradora
    public String getNomeSeguradora(Pessoa p) {
        if (p != null) {
            Carro carro = p.getCarro();
            if(carro!=null){
                Seguradora s = carro.getSeguradora();
                if(s!=null){
                    return s.getNome();
                }
            }
        }
        return "";
    }

    public Seguradora getSeguradora() {
        return this.seguradora;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSeguradora(Seguradora seguradora) {
        this.seguradora = seguradora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
