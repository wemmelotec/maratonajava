package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Cliente {
	// sequencia de inicialização
	//0° o bloco de inicialização estático é inicializado quando a JVM carregar a classe e apenas uma vez
	//1° é alocado o espaço na memória para o objeto que será criado
	//2° cada atributo de classe é criado e inicializado com seus valores default ou os valores esplicitados
	//3° bloco de inicialização é executado
	//4° o construtor é inicializado
	private static int[] parcelas;
    //bloco de inicialização
	{
		System.out.println("bloco de inicialização não estático");
	}
	//com o acrescimo do atributo static esse bloco de inicialização é executado apenas uma vez, independente 
	//da quantidade de vezes que eu chamar a classe
	static{
		parcelas = new int[100];
		System.out.println("dentro do bloco de inicialização estátivo");
		for(int i=1; i<=100; i++) {
			parcelas[i-1]=i;
		}
	}
	static {
		System.out.println("bloco de inicialização 2");
	}
	public Cliente() {
		
	}
	
	public static int[] getParcelas() {
		return parcelas;
	}

		
}
