package br.com.abc.javacore.Bintroducaometodos.classes;

public class Professor {

	public String nome;
	public String matricula;
	public String rg;
	public String cpf;
	
	public void imprime(Professor aux) {
		System.out.println(aux.cpf);
		System.out.println(aux.matricula);
		System.out.println(aux.nome);
		System.out.println(aux.rg);
	}
	
	public void imprimeDois() {
		System.out.println(this.cpf);
		System.out.println(this.matricula);
		System.out.println(this.nome);
		System.out.println(this.rg);
	}
}
