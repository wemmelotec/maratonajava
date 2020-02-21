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

	}

}
