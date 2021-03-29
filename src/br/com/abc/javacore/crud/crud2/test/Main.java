package br.com.abc.javacore.crud.crud2.test;

import br.com.abc.javacore.crud.crud2.classes.Estado;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {

        File diretorio = new File("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\crud\\crud2\\dados");
        diretorio.mkdir();
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
        List<Estado> estadoList = new ArrayList<>();
        Estado e1 = new Estado("Paraiba", "João Pessoa");
        Estado e2 = new Estado("Pernambuco", "Recife");
        Estado e3 = new Estado("Rio grande do norte", "Natal");
        Estado e4 = new Estado("Ceara", "Fortaleza");
        Estado e5 = new Estado("Alagoas", "Maceio");
        estadoList.add(e1);
        estadoList.add(e2);
        estadoList.add(e3);
        estadoList.add(e4);
        estadoList.add(e5);
        Collections.sort(estadoList);

        try {
            FileWriter fileWriter = new FileWriter(banco);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Estado e:estadoList) {
                bufferedWriter.write(e.toString());
                bufferedWriter.newLine();
            }
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
        /*
        Leitura do arquivo onde foram salvos os dados
         */

    }

}

