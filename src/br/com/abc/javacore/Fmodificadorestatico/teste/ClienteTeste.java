package br.com.abc.javacore.Fmodificadorestatico.teste;

import br.com.abc.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		System.out.println("Quantidade de parcelas possíveis");
		/*for(int aux : c.getParcelas()) {
			System.out.print(aux+ " ");
		}*/
		System.out.println("Tamanho: " + Cliente.getParcelas().length);
		System.out.println("Tamanho: " + Cliente.getParcelas().length);
		System.out.println("Tamanho: " + Cliente.getParcelas().length);
	}

}
