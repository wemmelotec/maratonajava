package br.com.abc.javacore.exception.checked.test;

import br.com.abc.javacore.exception.checked.classes.Funcionario;
import br.com.abc.javacore.exception.checked.classes.Pessoa;
import br.com.abc.javacore.exception.customexception.LoginInvalideException;

import java.io.FileNotFoundException;

public class SobreescritaComExecptionTest {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();
        //posso declarar nenhuma ou algumas exceções da superclasse Pessoa
        f.salvar();

        try {
            p.salvar();
        } catch (LoginInvalideException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
