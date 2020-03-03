package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

public class EstudanteTeste {

	public static void main(String[] args) {

		Estudante aluno01 = new Estudante();
		
		aluno01.setNome("Wellington");
		aluno01.setIdade(35);
		aluno01.setNotas(new double[] {10,10,9});
		
		
		aluno01.imprimirDados();
		aluno01.tirarMedia();
		
		System.out.println(aluno01.getNome());
		System.out.println(aluno01.isAprovado());
		

	}

}
