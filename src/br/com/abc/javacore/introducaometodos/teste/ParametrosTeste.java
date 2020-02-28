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
		 * Quando eu passo argumentos do tipo primitivo, eu estou passando uma c�pia
		 * dos valores que est�o nas vari�veis, logo os valores nas vairaveis nunca ser�o
		 * alterados, como no exemplo acima
		 * 
		 * J� no exemplo abaixo eu passo como argumento um array que n�o � do tipo primitivo
		 * sendo assim, estou passando uma refer�ncia
		 * e dessa forma eu posso alterar o valor
		 */
		
		int [] i = {2};
		System.out.println("Antes do m�todo");
		System.out.println("Refer�ncia i: "+i+"      Valor em i: "+i[0]);
		System.out.println("Dentro do teste");
		calc.alteraValorNoVetor(i);
		System.out.println("Depois do m�todo");
		System.out.println("Refer�ncia i: "+i+"      Valor em i: "+i[0]);
		
		
	}

}
