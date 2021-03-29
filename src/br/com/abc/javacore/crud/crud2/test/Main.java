package br.com.abc.javacore.crud.crud2.test;

import br.com.abc.javacore.crud.crud2.classes.Estado;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File diretorio = new File("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\crud\\crud2\\dados");
        boolean verificador = diretorio.mkdir();
        System.out.println(verificador);
        /*
        Criação do diretório onde o arquivo com os dados será salvo
         */

        File banco = new File("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\crud\\crud2\\dados\\dados.txt");
        try {
            banco.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        Criação do arquivo onde os dados dos objetos serão salvos
         */

        try {
            FileWriter fileWriter = new FileWriter(banco);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Estado e1 = new Estado("Paraiba", "João Pessoa");
            Estado e2 = new Estado("Pernambuco", "Recife");
            Estado e3 = new Estado("Rio grande do norte", "Natal");
            Estado e4 = new Estado("Ceara", "Fortaleza");
            bufferedWriter.write(e1.toString());
            bufferedWriter.newLine();
            bufferedWriter.write(e2.toString());
            bufferedWriter.newLine();
            bufferedWriter.write(e3.toString());
            bufferedWriter.newLine();
            bufferedWriter.write(e4.toString());
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        Escrevendo os objetos no arquivo
         */

        try {
            FileReader fileReader = new FileReader(banco);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String obj = null;

            while ( (obj = bufferedReader.readLine()) != null){
                System.out.println(obj);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
