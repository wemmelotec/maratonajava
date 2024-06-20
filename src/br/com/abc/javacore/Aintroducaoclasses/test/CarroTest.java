package br.com.abc.javacore.Aintroducaoclasses.test;

/**
 * o import serve para abreviar os comandos, por exemplo, eu poderia criar um objeto carro sem utilizar o import e ficaria assim
 * br.com.abc.javacore.introducaoclasses.classes.Carro carro = new Carro(); 
 */
import br.com.abc.javacore.Aintroducaoclasses.classes.Carro;

public class CarroTest {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		Carro carro2 = new Carro();

		//carro é uma variável de referência
		carro.modelo="Ka";
		carro.placa="QFW-4565";
		carro.velocidadeMaxima=200;
		carro2.modelo="Fiat";
		carro2.placa="QFW-XXXX";
		carro2.velocidadeMaxima=300;


//		System.out.println(carro.hashCode());
//		System.out.println(carro.getClass());
//		System.out.println(carro.toString());
//
//		System.out.println(carro);
//
		System.out.println(carro.toString());
		System.out.println(carro2.toString());
//		System.out.println(carro.placa);
//		System.out.println(carro.velocidadeMaxima);
//		System.out.println(carro.toString());
		
		
	}
}
