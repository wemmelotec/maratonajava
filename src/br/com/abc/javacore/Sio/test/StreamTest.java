package br.com.abc.javacore.Sio.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest {
    public static void main(String[] args) {
        //gravador();
        leitor();
    }
    /*
    esse método cria um arquivo dentro da pasta e escreve nele, o true me permite adicionar dados no arquivo
    sem apagar
     */
    private static void gravador(){
        byte[] dados = {65,66,67,68,69,70};
        try(FileOutputStream gravador = new FileOutputStream("pasta/stream.txt",true)) {
            gravador.write(dados);
            System.out.println("Dados gravados com sucesso!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   //esse método lê o que foi gravado no arquivo
    private static void leitor(){
        try(FileInputStream leitor = new FileInputStream("pasta/stream.txt")) {
            int leitura;
            //por que o -1? o -1 indica que a leitura chegou ao final do arquivo
            while ((leitura = leitor.read())!= -1){
                byte b = (byte) leitura;
                System.out.println(" "+b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
