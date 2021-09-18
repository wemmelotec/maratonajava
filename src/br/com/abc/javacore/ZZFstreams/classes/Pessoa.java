package br.com.abc.javacore.ZZFstreams.classes;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

/*
� uma sequ�ncia de elementos que suporta uma opera��o de processamento de dados.
� uma forma de se manipular os dados como se estivessemos no BD.
Stremas manipula cole��es.
Diferen�a entre streams e cole��o:
    cole��o -> dados (guarda)
    stream -> processamento (processa dados)
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
    //vou criar este m�todo apenas para j� ter uma lista pronta para trabalhar na stream
    public static List<Pessoa> bancoDePessoas(){
        return asList(
                new Pessoa("william",22,2000),
                new Pessoa("mercy",22,2500),
                new Pessoa("mercy",22,2500),
                new Pessoa("ana",19,1895),
                new Pessoa("thor",23,1980),
                new Pessoa("hulk",35,8000),
                new Pessoa("flash",29,3200),
                new Pessoa("batman",37,10000),
                new Pessoa("lanterna verde",24,5000)
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
