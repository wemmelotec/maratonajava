package br.com.abc.javacore.strings.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        //stringbuilder não é uma string, ela não vai criar uma string no pool de strings
        StringBuilder sb = new StringBuilder(16);
        sb.append("Uma frase comum");
        sb.append(" acrecentando");
        System.out.println(sb);//toda vez que eu coloco uma referência do sout o que será chamado é o toString
        System.out.println(sb.reverse());
        System.out.println(sb.delete(18,28));
        System.out.println(sb.insert(3,"#####"));

    }
}
