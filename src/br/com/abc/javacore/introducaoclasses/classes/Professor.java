package br.com.abc.javacore.introducaoclasses.classes;

public class Professor extends Estudante {

	public int rg;
	public String cpf;
	
	
	public void imprimirArgumentos(Professor aux) {
		System.out.println(aux.nome);
		System.out.println(aux.matricula);
		System.out.println(aux.idade);
		System.out.println(aux.rg);
		System.out.println(aux.cpf);
		System.out.println("---------------------------------");
	}
}

