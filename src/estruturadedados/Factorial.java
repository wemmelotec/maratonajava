package estruturadedados;

public class Factorial {
    public static void main(String[] args) {
        /*
        Este é um problema que aborda a ideia da recursividade, ou seja, um método que vai chamando a si mesmo
        para resolver o problema, até o retorno a base.
         */
        double x = 1;//armazena o número fatorial
        double y = x;//armazena o resultado temporário da multiplicação

        if(x==0){
            y=1;
        }else {
            while (x > 1) { //caso recursivo
                y = y * (x - 1);
                x--;
            }
        }
        System.out.println(y);
    }

}
