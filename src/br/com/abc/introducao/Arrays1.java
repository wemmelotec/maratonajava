//o nome do pacote por convenção deve ser feito pegando o domínio da empresa e escrevendo da de trás para frente
package br.com.abc.introducao;

public class Arrays1 {
	public static void main(String[] args) {

		/*
		 * o java básicamente tem dois tipos de dados, tipo primitivos e objetos todo
		 * array é considerado um objeto
		 */
		int[] idades = new int[3];// mais recomendado
		/*
		 * int idade2[];//menos usado
		 */
		
		//colocar valores no array
		idades[0]=20;
		idades[1]=21;
		idades[2]=30;
		
		//acessar valores no array
		System.out.println("idade 1: " + idades[0]);
		System.out.println("idade 2: " + idades[1]);
		System.out.println("idade 3: " + idades[2]);
		
//testando o git
	}

}
