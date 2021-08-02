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
	 * Esse m�todo vai receber o argumento por refer�ncia
	 * Vai imprimir a refer�ncia recebida
	 * Vai imprimir o valor da posi��o 0 daquela refer�ncia
	 * Cria um novo vetor
	 * imprimi a refer�ncia deste novo vetor
	 * altera o valor na refer�ncia recebida por argumento
	 * Assim esse m�todo altera o valor mas n�o muda a refer�ncia ele cria uma
	 * refer�ncia tempor�ria para dentro do m�todo
	 */

	public static void change_i(int i[]) {
		System.out.println("obj i2:" + i);
		System.out.println("II:" + i[0]);
		int j[] = { 2 };
		System.out.println("refer�ncia do J:" + j);
		i[0] = 40;
		i = j;
		System.out.println("obj i3:" + i);
		System.out.println("I: " + i[0]);
		System.out.println("J: " + j[0]);
	}

}
