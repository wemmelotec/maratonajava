package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Professor;

public class ProfessorTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor prof = new Professor();
		prof.cpf="123.123.123-12";
		prof.matricula="456";
		prof.nome="Wellington";
		prof.rg="789";
		
		Professor prof2 = new Professor();
		prof2.cpf="987.987.987-98";
		prof2.matricula="852";
		prof2.nome="Silvana";
		prof2.rg="753";
		
		/*
		 * Aqui eu estou passando objetos que n�o s�o primitivos
		 * logo estou passando a refer�ncia do endere�o deste objeto
		 */
		prof.imprime(prof);
		prof.imprime(prof2);
		
		/*
		System.out.println(prof.cpf);
		System.out.println(prof.matricula);
		System.out.println(prof.nome);
		System.out.println(prof.rg);
		
		System.out.println(prof2.cpf);
		System.out.println(prof2.matricula);
		System.out.println(prof2.nome);
		System.out.println(prof2.rg);
		*/
		

	}

}
