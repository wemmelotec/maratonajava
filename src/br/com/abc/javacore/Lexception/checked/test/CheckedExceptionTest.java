package br.com.abc.javacore.Lexception.checked.test;

import java.io.File;
import java.io.IOException;

//Vou utilizar a File pois ela j� tem um throw na assinatura do m�todo createnewfile
public class CheckedExceptionTest {
    public static void main(String[] args) {
        criarArquivo();
    }
    //o m�todo tem que ser static pois estou na mesma classe do psvm
    public static void criarArquivo(){
        File file = new File("Teste.txt");
        //importante! ainda n�o criei o arquivo, criei apenas o objeto do tipo File, na linha abaixo eu tento criar o arquivo
        try {
            System.out.println("O arquivo foi criado? " + file.createNewFile());
            System.out.println("O arquivo foi criado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
