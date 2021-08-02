package br.com.abc.javacore.padroesdeprojeto.classes;
/*
Padr�o de projeto � uma forma que voc� tem de codificar que vai resolver um problema especifico
Esse � o padr�o builder
 */
public class Pessoa {
    private String nome;
    private String ultimoNome;
    private String nomedoMeio;
    private String apelido;
    private String nomedoPai;
    //coloquei o construtor no privado pois que usara ser� o builder
    private Pessoa(String nome, String ultimoNome, String nomedoMeio, String apelido, String nomedoPai) {
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.nomedoMeio = nomedoMeio;
        this.apelido = apelido;
        this.nomedoPai = nomedoPai;
    }

    //padr�o builder
    public static class PessoaBuilder{
        private String nome;
        private String ultimoNome;
        private String nomedoMeio;
        private String apelido;
        private String nomedoPai;

        public PessoaBuilder() {
        }

        public PessoaBuilder nome(String nome){
            this.nome = nome;
            return this;
        }
        public PessoaBuilder ultimoNome(String ultimoNome){
            this.ultimoNome = ultimoNome;
            return this;
        }
        public PessoaBuilder nomedoMeio(String nomedoMeio){
            this.nomedoMeio = nomedoMeio;
            return this;
        }
        public PessoaBuilder apelido(String apelido){
            this.apelido = apelido;
            return this;
        }
        public PessoaBuilder nomedoPai(String nomedoPai){
            this.nomedoPai = nomedoPai;
            return this;
        }
        public Pessoa build(){
            return new Pessoa(nome,ultimoNome,nomedoMeio,apelido,nomedoPai);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getNomedoMeio() {
        return nomedoMeio;
    }

    public void setNomedoMeio(String nomedoMeio) {
        this.nomedoMeio = nomedoMeio;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNomedoPai() {
        return nomedoPai;
    }

    public void setNomedoPai(String nomedoPai) {
        this.nomedoPai = nomedoPai;
    }
}
