package br.com.abc.javacore.exception.checked.test;

import br.com.abc.javacore.exception.checked.classes.Leitor1;
import br.com.abc.javacore.exception.checked.classes.Leitor2;

//classe que utiliza leitor 1 e leitor 2 que implementam closeble
public class TryWithResourcesTest2 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()){
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
