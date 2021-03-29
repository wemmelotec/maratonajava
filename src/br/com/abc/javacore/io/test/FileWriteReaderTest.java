package br.com.abc.javacore.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//essa classe serve para escrever e ler caracteres em um arquivo
public class FileWriteReaderTest {
    public static void main(String[] args) {
        File file = new File("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\io\\Arquivo.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);//posso passar como par�metro o apend true que far� escrever no filan do arquivo
            fileWriter.write("Escrevendo uma mensagem no arquivo \nE pulando uma linha");
            /*
            quando voc� est� escrvendo em um arquivo, o sistema operacional cria uma Stream,
            algo parecido com um t�nel em o java e o arquivo, por onde voc� fica enviando e recebendo os bytes escritos
            para ter certeza que esse t�nel ser� fechado sem ter nenhuma byte dentro, � que serve a linha a baixo
             */
            fileWriter.flush();//cospe tudo que ficou na stream, no t�nel
            fileWriter.close();//fecha

            FileReader fileReader = new FileReader(file);
            char[] in = new char[500];
            int size = fileReader.read(in);
            System.out.println("Tamanho "+ size);
            for (Character c:in) {
                System.out.print(c);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
