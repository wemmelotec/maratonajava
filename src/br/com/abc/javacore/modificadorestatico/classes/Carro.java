package br.com.abc.javacore.modificadorestatico.classes;

/*----------------------------*\
 *About atributo static       *					
/*----------------------------*/

/*
 * O atibuto Static não pertece mais ao objeto que será criado e sim a classe
 */

public class Carro {
	//velocidade limite de 240km
	private String nome;
	private double velocidadeMaxima;
	public static double velocidadeLimite = 240;
	
	
	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public Carro() {
		
	}
	
	public void imprime() {
		System.out.println("*********************");
		System.out.println(this.nome);
		System.out.println("Velocidade máxima " + this.velocidadeMaxima);
		System.out.println("Velocidade limite " + velocidadeLimite);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	
}
