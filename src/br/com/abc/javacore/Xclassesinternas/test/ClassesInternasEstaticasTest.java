package br.com.abc.javacore.Xclassesinternas.test;
class Externa{
    static class Interna{
        public void imprimir(){
            System.out.println("oi");
        }
    }
}
public class ClassesInternasEstaticasTest {
    public static void main(String[] args) {
        Externa.Interna teste = new Externa.Interna();
        teste.imprimir();
    }
}
