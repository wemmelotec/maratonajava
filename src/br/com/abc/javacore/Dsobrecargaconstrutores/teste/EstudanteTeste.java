package br.com.abc.javacore.Dsobrecargaconstrutores.teste;

import br.com.abc.javacore.Dsobrecargaconstrutores.classes.Estudante;

public class EstudanteTeste {

	public static void main(String[] args) {
		
		Estudante est = new Estudante("1111", "wellington", new double[] {10,8,9}, "11/11/2020");
		
		est.imprime();

	}

}
