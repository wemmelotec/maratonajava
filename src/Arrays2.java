public class Arrays2 {

	public static void main(String[] args) {

		int[] idades = new int[3]; // float, short, long, float, double se iniciam com os mesmo valores do int que
									// é o 0
		String[] nomes = new String[3];
		boolean[] situacao = new boolean[3];
		char[] caracteres = new char[3];

		for (int i = 0; i < idades.length; i++) {
			System.out.println((i+1) + " idade " + idades[i]);
	 	}
		for (int i = 0; i < nomes.length; i++) {
			System.out.println((i+1) + " nome " + nomes[i]);
		}
		for (int i = 0; i < situacao.length; i++) {
			System.out.println((i+1) + "situacao" + situacao[i]);
		}
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println((i+1) + caracteres[i]);
		}

		//verificar o tamanho do array com o atributo length
		System.out.println(nomes.length);
	}
}