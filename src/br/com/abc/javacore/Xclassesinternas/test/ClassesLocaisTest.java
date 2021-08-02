package br.com.abc.javacore.Xclassesinternas.test;

public class ClassesLocaisTest {
    private String nome = "William";
    public void fazAlgumaCoisa(){
        //observe que mesmo essa classe interna estando dentro de um método ela continua com acesso aos atríbutos
        class Interna{
            public void imprimeNomeExterno(){
                System.out.println(nome);
            }
        }
        //fora daqui você não consegue chamar essa classe interna de nenhuma outra forma
        Interna in = new Interna();
        in.imprimeNomeExterno();
    }
    public static void main(String[] args) {
        ClassesLocaisTest externa = new ClassesLocaisTest();
        externa.fazAlgumaCoisa();
    }
}
