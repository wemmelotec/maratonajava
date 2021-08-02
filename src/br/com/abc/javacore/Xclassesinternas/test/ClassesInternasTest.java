package br.com.abc.javacore.Xclassesinternas.test;

public class ClassesInternasTest {
    private String name = "William Dev Dojo";

    class Interna{
        public void verClasseExterna(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
    //para chamar a classe interna, eu preciso antes de um objeto da classe externa
    ClassesInternasTest externa = new ClassesInternasTest();
    ClassesInternasTest.Interna in = externa.new Interna();
    in.verClasseExterna();

    //outra forma de criar a classe interna
        ClassesInternasTest.Interna in2 = new ClassesInternasTest().new Interna();
        in2.verClasseExterna();
    }
}

//class Externa{
//    private String name = "William Dev Dojo";
//    //um classe interna é como se fosse um método
//    class Interna{
//        public void verClasseExterna(){
//            System.out.println(name);
//        }
//    }
//}
