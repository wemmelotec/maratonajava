package br.com.abc.javacore.construtores.teste;

import br.com.abc.javacore.construtores.classes.Pessoa;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa agente = new Pessoa("Wellington");
											//se no parâmetro estivesse assim double... notas
											//eu poderia passar o argumento assim 10,10,9
		agente.preencarDados("Silvana", 35, new double[] {10,10,9});
		agente.imprime();

	}

}
