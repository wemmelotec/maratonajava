package br.com.abc.javacore.introducaometodos.classes;

public class Calculadora {
	//1 modificador de acesso
	//2 tipo de retorno ou nenhum retorno
	//3 nome do m�todo (que seque a conven��o da nomea��o das variaveis)
	
	public void somaDoisNumeros() {
		System.out.println(5+5);
	}
	
	public void subtraiDoisNumeros() {
		System.out.println(5-5);
	}
	
	//criar m�todos que recebam valores nos seus parametros
	
	public void multiplicaDoisNumeros(int num1,byte num2) {
		System.out.println(num1*num2);
		
	}
	/*
	 * Quando o m�todo tem algum tipo de retorno, significa que esse retorno
	 * ser� utilizado pela classe.
	 */
	
	//criar uma m�todo com retorno
	public double divideDoisNumeros(double num1, double num2) {
		if (num2 != 0) { 
		double resultado = num1/num2;
		return resultado; //o return indica que o m�todo acaba aqui e n�o segue executando o bloco
		}
		//QUando eu coloco um return dentro de um if eu tenho que colocar outro return fora
		//para garantir que o meu m�todo vai ter um retorno.
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
		System.out.println("N�o � poss�vel dividir por zero");
	}
	
	
	public void alteraDoisNumeros(int num1, int num2) {
		num1 = 30;
		num2 = 40;
		System.out.println("Dentro do m�todo");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}
}
	
	

