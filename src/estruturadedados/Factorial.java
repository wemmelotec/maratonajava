package estruturadedados;

public class Factorial {
    public static void main(String[] args) {
        /*
        Este � um problema que aborda a ideia da recursividade, ou seja, um m�todo que vai chamando a si mesmo
        para resolver o problema, at� o retorno a base.
         */
        double x = 1;//armazena o n�mero fatorial
        double y = x;//armazena o resultado tempor�rio da multiplica��o

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
