package br.com.abc.introducao.arrays;

public class Arrays3 {

	public static void main(String[] args) {
	
		int[] numeros = new int[5];
		int[] numeros2 = {1,2,48,4,5};
		int[] numeros3 = new int[] {1,2,3,7,8};
		
		//novo tipo de for o foreach
		//o que acontece por trás deste código
		//ele pega cada elemento da posição desse array e joga no aux
		for(int aux : numeros2) {
			System.out.println(aux);
		}
	}
	//teste
}
