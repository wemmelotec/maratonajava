package br.com.abc.javacore.Jenumaula.classes;

public class Cliente {
    //outra forma de criar um enum é como atributo dentro da própria classe
    public enum TipoPagamento{
        AVISTA, APRAZO;
    }
    private String nome;
    //comentei após a implementação da classe ENUM
    //public static final int PESSOA_FISICA = 1;
    //public static final int PESSOA_JURIDICA = 2;
    private TipoCliente tipo;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }
}
