package br.com.abc.javacore.Bintroducaometodos.classes;

public class Calculadora {
	//1 modificador de acesso
	//2 tipo de retorno ou nenhum retorno
	//3 nome do método (que seque a convenção da nomeação das variaveis)
	
	public void somaDoisNumeros() {
		System.out.println(5+5);
	}
	
	public void subtraiDoisNumeros() {
		System.out.println(5-5);
	}
	
	//criar métodos que recebam valores nos seus parametros
	
	public void multiplicaDoisNumeros(int num1,byte num2) {
		System.out.println(num1*num2);
		
	}
	/*
	 * Quando o método tem algum tipo de retorno, significa que esse retorno
	 * será utilizado pela classe.
	 */
	
	//criar uma método com retorno
	public double divideDoisNumeros(double num1, double num2) {
		if (num2 != 0) { 
		double resultado = num1/num2;
		return resultado; //o return indica que o método acaba aqui e não segue executando o bloco
		}
		//QUando eu coloco um return dentro de um if eu tenho que colocar outro return fora
		//para garantir que o meu método vai ter um retorno.
		return 0;
		}
		
		//ou pode ser escrito assim, de forma direta para economizar linha
		/*
		 * return num1/num2;
		 */
	
	public void imprimiDoisNumerosDivididos(double num1, double num2) {
		
		if (num2 != 0) {
			System.out.println(num1/num2);
			return;
		}
		System.out.println("Não é possível dividir por zero");
	}
	
	
	public void alteraDoisNumeros(int num1, int num2) {
		num1 = 30;
		num2 = 40;
		System.out.println("Dentro do método");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}
	
	public void alteraValorNoVetor(int [] aux) {
		aux[0] = 35;
		System.out.println("Referência aux: "+aux+"      Valor em aux: "+aux[0]);
		int [] j = {40};
		System.out.println("Referência j: "+j);
		aux = j;
		System.out.println("Referência aux: "+aux);
	}
	
	public void somaArray(int[] numeros) {
		int soma = 0;
		//esse é o foreach que vai percorrer o array
		for(int num : numeros) {
			soma += num;
		}
		System.out.println(soma);
	}
	
	//Método que vai receber o varargs.
	//Esse método pode receber valores ou array, no caso de valores o java se encarrega de 
	//montar um array com esses valores
	//o que muda realmente é na chamada do método
	public void somaVarArgs(int... numeros) {
		int soma = 0;
		//esse é o foreach que vai percorrer o array
		for(int num : numeros) {
			soma += num;
		}
		System.out.println(soma);
	}
}
	
	

