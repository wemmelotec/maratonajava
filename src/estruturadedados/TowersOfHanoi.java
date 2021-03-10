package estruturadedados;

import java.util.Scanner;
/*
Essa Torre de Hanoi � um �timo exemplo de recursividade
 */

public class TowersOfHanoi {
    // M�todo que realiza (imprime) o movimento
    // de um disco entre dois pinos
    private static void mover(int O, int D) {
        System.out.println(O + " -> " + D);
    }

    // M�todo que implementa a recurs�o
    // O = pino origem
    // D = pino destino
    // T = pino de trabalho
    static void hanoi(int n, int O, int D, int T) {

        if (n > 0) {
            hanoi(n - 1, O, T, D);
            mover(O, D);
            hanoi(n - 1, T, D, O);
        }
    }
    // executando o hanoi
    public static void main(String[] args) {

        int n; // n�mero de discos

        // recebe o n�mero de discos digitado pelo usu�rio
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o n�mero de discos: ");
        n = entrada.nextInt();

        // executa o hanoi!
        TowersOfHanoi.hanoi(n, 1, 3, 2);
    }
}
