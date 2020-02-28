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
		 * Dessa forma, a variav�l de refer�ncia prof e prof2 � quem vai executar o m�todo
		 * imprimeDois dentro do pr�prio objeto que j� est� refer�nciado na vari�vel de
		 * refer�ncia  
		 */
		/*
		 * Como o m�todo imprimeDOis j� est� dentro do objeto(espa�o de mem�ria), essa � uma
		 * forma dele j� pegar as informa��es dentro desse mesmo espa�o de mem�ria, sem ter
		 * que passar um objeto(refer�ncia) como argumento
		 */
		prof.imprimeDois();
		System.out.println("*******************");
		prof2.imprimeDois();

	}

}
