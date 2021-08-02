package br.com.abc.javacore.Xclassesinternas.test;
class Animal{
    public void andar(){
        System.out.println("animal andando");
    }
}
public class ClassesAnonimasTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.andar();
        //suponha que você precise alterar o comportamento de andar, e não queira criar uma subclasse para sobreescrever o método
        //para isso servem as classes anonimas
        Animal b = new Animal(){
          public void andar(){
              System.out.println("Andando anonimamente");
          }
        };
        b.andar();
    }
}
