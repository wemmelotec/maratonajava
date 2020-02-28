package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class ParametrosTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		
		int num1 = 5;
		int num2 = 10;
		
		calc.alteraDoisNumeros(num1, num2);
		System.out.println("Dentro do teste");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		/*
		 * Quando eu passo argumentos do tipo primitivo, eu estou passando uma cópia
		 * dos valores que estão nas variáveis, logo os valores nas vairaveis nunca serão
		 * alterados, como no exemplo acima
		 * 
		 * Já no exemplo abaixo eu passo como argumento um array que não é do tipo primitivo
		 * sendo assim, estou passando uma referência
		 * e dessa forma eu posso alterar o valor
		 */
		
		int [] i = {2};
		System.out.println("Antes do método");
		System.out.println("Referência i: "+i+"      Valor em i: "+i[0]);
		System.out.println("Dentro do teste");
		calc.alteraValorNoVetor(i);
		System.out.println("Depois do método");
		System.out.println("Referência i: "+i+"      Valor em i: "+i[0]);
		
		
	}

}
