package br.com.abc.javacore.Userializacao.test;

import br.com.abc.javacore.Userializacao.classes.Aluno;

import java.io.*;

public class SerializacaoTest {
    public static void main(String[] args) {
        //gravadorObjeto();
        leitorObjeto();
    }
    //serializar (gravar)
    private static void gravadorObjeto(){
        Aluno aluno = new Aluno(1L, "Wellington", "123456");
        //salvar esse aluno num arquivo
        try {
            FileOutputStream fos = new FileOutputStream("aluno.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(aluno);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //desserializar (ler)
    private static void leitorObjeto(){
        try {
            FileInputStream fis = new FileInputStream("aluno.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
