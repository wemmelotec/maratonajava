package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Professor;

public class ProfessorTesteThis {

	public static void main(String[] args) {
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
		 * Dessa forma, a variavél de referência prof e prof2 é quem vai executar o método
		 * imprimeDois dentro do próprio objeto que já está referênciado na variável de
		 * referência  
		 */
		/*
		 * Como o método imprimeDOis já está dentro do objeto(espaço de memória), essa é uma
		 * forma dele já pegar as informações dentro desse mesmo espaço de memória, sem ter
		 * que passar um objeto(referência) como argumento
		 */
		prof.imprimeDois();
		System.out.println("*******************");
		prof2.imprimeDois();

	}

}
