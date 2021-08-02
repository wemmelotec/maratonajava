package br.com.abc.javacore.Sio.test;

import java.io.*;

public class BuferedTest {
    public static void main(String[] args) {
        File file = new File("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\io\\test\\Teste.txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Escrevendo no arquivo");
            bw.newLine();
            bw.write("Escrevendo na outra linha após o newline");
            bw.flush();
            bw.close();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s = null;
            while ((s=br.readLine()) != null){
                System.out.println(s);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
