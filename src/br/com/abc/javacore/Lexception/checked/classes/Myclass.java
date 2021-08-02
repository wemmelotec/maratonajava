package br.com.abc.javacore.Lexception.checked.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Myclass {

    public void fileNotFoundExceptionIsCaughtInside(){
        try{
            createFileReader();
        }catch (FileNotFoundException e){
            System.out.println("dentro do catch");
        }
    }

    public void fileNotFoundExceptionIsReThrown() throws FileNotFoundException {
        createFileReader();
    }

    public void createFileReader() throws FileNotFoundException {

        File file = new File("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\exception\\checked");
        new FileReader(file);
    }
}
