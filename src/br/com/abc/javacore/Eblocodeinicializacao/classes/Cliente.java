package br.com.abc.javacore.Eblocodeinicializacao.classes;

public class Cliente {
	// sequencia de inicializa��o
	//1� � alocado o espa�o na mem�ria para o objeto que ser� criado
	//2� cada atributo de classe � criado e inicializado com seus valores default ou os valores esplicitados
	//3� bloco de inicializa��o � executado
	//4� o construtor � inicializado
	private int[] parcelas;
    //bloco de inicializa��o
	{
		parcelas = new int[100];
		System.out.println("dentro do bloco de inicializa��o");
		for(int i=1; i<=100; i++) {
			parcelas[i-1]=i;
		}
	}
	public Cliente() {
		
	}
	
	public int[] getParcelas() {
		return parcelas;
	}

	public void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	}
	
	
}
