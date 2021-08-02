package br.com.abc.javacore.Bintroducaometodos.teste;

public class Rascunho {
	
	public static void main(String args[]) {
		
		int i[] = { 1 };
		
		System.out.println("obj i1:" +i);
		
		change_i(i);
		
		System.out.println("obj i4:" + i);
		System.out.println(i[0]);
	}
	
	/*
	 * Esse método vai receber o argumento por referência
	 * Vai imprimir a referência recebida
	 * Vai imprimir o valor da posição 0 daquela referência
	 * Cria um novo vetor
	 * imprimi a referência deste novo vetor
	 * altera o valor na referência recebida por argumento
	 * Assim esse método altera o valor mas não muda a referência ele cria uma
	 * referência temporária para dentro do método
	 */

	public static void change_i(int i[]) {
		System.out.println("obj i2:" + i);
		System.out.println("II:" + i[0]);
		int j[] = { 2 };
		System.out.println("referência do J:" + j);
		i[0] = 40;
		i = j;
		System.out.println("obj i3:" + i);
		System.out.println("I: " + i[0]);
		System.out.println("J: " + j[0]);
	}

}
