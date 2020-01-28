
public class ControleFluxo6 {

	public static void main(String[] args) {

		// dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
		// porém as parcelas não podem ser menores do que 1000

		double valorTotal = 30000;

		for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {

			double valorParcela = valorTotal / parcela;

			if (valorParcela <= 1000) {
				continue;//o continue faz com que o código abaixo dele seja ignorado retornando ao laço for
			}
			System.out.println("Parcela " + parcela + " R$ " + valorParcela);
		}

	}

}
