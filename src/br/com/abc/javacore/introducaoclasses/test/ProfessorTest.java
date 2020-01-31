package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {

	public static void main(String[] args) {
		Professor professor1 = new Professor();
		
		professor1.nome="wellington";
		professor1.matricula=2080;
		professor1.rg=2638027;
		professor1.cpf="012.801.224-20";
		
		System.out.println(professor1.nome);
		System.out.println(professor1.matricula);
		System.out.println(professor1.rg);
		System.out.println(professor1.cpf);
		
	}
}
