package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Cliente {
	// sequencia de inicializa��o
	//0� o bloco de inicializa��o est�tico � inicializado quando a JVM carregar a classe e apenas uma vez
	//1� � alocado o espa�o na mem�ria para o objeto que ser� criado
	//2� cada atributo de classe � criado e inicializado com seus valores default ou os valores esplicitados
	//3� bloco de inicializa��o � executado
	//4� o construtor � inicializado
	private static int[] parcelas;
    //bloco de inicializa��o
	{
		System.out.println("bloco de inicializa��o n�o est�tico");
	}
	//com o acrescimo do atributo static esse bloco de inicializa��o � executado apenas uma vez, independente 
	//da quantidade de vezes que eu chamar a classe
	static{
		parcelas = new int[100];
		System.out.println("dentro do bloco de inicializa��o est�tivo");
		for(int i=1; i<=100; i++) {
			parcelas[i-1]=i;
		}
	}
	static {
		System.out.println("bloco de inicializa��o 2");
	}
	public Cliente() {
		
	}
	
	public static int[] getParcelas() {
		return parcelas;
	}

		
}
