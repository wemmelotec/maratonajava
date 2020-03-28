package br.com.abc.javacore.introducaoclasses.test;

/*
 * o import serve para abreviar os comandos, por exemplo, eu poderia criar um objeto carro sem utilizar o import e ficaria assim
 * br.com.abc.javacore.introducaoclasses.classes.Carro carro = new Carro(); 
 */
import br.com.abc.javacore.introducaoclasses.classes.Carro;

public class CarroTest {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		//carro é uma variável de referência
		carro.modelo="Ka";
		carro.placa="QFW-4565";
		carro.velocidadeMaxima=200;
		
		System.out.println(carro);
		
		System.out.println(carro.modelo);
		System.out.println(carro.placa);
		System.out.println(carro.velocidadeMaxima);
		
		
	}
}
