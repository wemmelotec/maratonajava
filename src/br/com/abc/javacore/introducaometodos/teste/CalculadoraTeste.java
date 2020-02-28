package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		System.out.println("Antes de chamar o método soma");
		calc.somaDoisNumeros();
		System.out.println("Terminando a execução do método soma");
		System.out.println("Antes de chamar o método subtrai");
		calc.subtraiDoisNumeros();
		System.out.println("Terminando a execução do método subtrai");
		
		//chamar métodos e enviar argumentos
		System.out.println("Antes de chamar o método multiplica");
		//só um exemplo de casting no argumento
		calc.multiplicaDoisNumeros(2,(byte) 5);
		System.out.println("Terminando a execução do método multiplica");
		
		System.out.println("Antes de chamar o método divide");
		double result = calc.divideDoisNumeros(45, 0);
		System.out.println(result);
		System.out.println("Terminando a execução do método divide");
		
		System.out.println("Antes de chamar o método divide");
		calc.imprimiDoisNumerosDivididos(45, 9);
		System.out.println("Terminando a execução do método divide");
		System.out.println("****************************");
		int [] numeros = new int[]{1,2,3,4,5};
		//int [] numeros = {1,2,3,4,5};
		System.out.println("Soma do Array");
		calc.somaArray(numeros);
		System.out.println("****************************");
		System.out.println("Resultado da chamada do método com o VarArgs");
		//aqui em vez de passar um Array eu posso passar apenas valores separados por virgula
		//assim, quando o java receber esses valores, ele vai se encarregar de transforma ele em um array
		//e executar o método
		calc.somaVarArgs(1,15,3);
	}

}
