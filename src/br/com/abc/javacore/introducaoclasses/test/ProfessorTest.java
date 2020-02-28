package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {

	public static void main(String[] args) {
		Professor professor1 = new Professor();
		
		professor1.nome="wellington";
		professor1.matricula=2080;
		professor1.rg=2638027;
		professor1.cpf="012.801.224-20";
		professor1.idade=36;
		
		Professor professor2 = new Professor();
		professor2.nome="Silvana";
		professor2.matricula=2050;
		professor2.rg=264646447;
		professor2.cpf="xxxx";
		professor2.idade=40;
		
		professor1.imprimirArgumentos(professor1);
		professor2.imprimirArgumentos(professor2);
		
		/*System.out.println(professor1.nome);
		System.out.println(professor1.matricula);
		System.out.println(professor1.rg);
		System.out.println(professor1.cpf);
		System.out.println(professor1.idade);
		System.out.println("---------------------------------");
		System.out.println(professor2.nome);
		System.out.println(professor2.matricula);
		System.out.println(professor2.rg);
		System.out.println(professor2.cpf);
		System.out.println(professor2.idade);
		System.out.println("---------------------------------");
		*/
		System.out.println(professor1);
		System.out.println(professor2);
	}
}
