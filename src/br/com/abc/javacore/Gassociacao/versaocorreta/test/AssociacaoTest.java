package br.com.abc.javacore.Gassociacao.versaocorreta.test;

import br.com.abc.javacore.Gassociacao.versaocorreta.classes.Aluno;
import br.com.abc.javacore.Gassociacao.versaocorreta.classes.Local;
import br.com.abc.javacore.Gassociacao.versaocorreta.classes.Professor;
import br.com.abc.javacore.Gassociacao.versaocorreta.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {

        // primeiro você cria o aluno o seminários e depois você associa eles, criar os objetos
        Aluno aluno = new Aluno("William", 27);
        Aluno aluno2 = new Aluno("Silvana", 20);
        Seminario sem = new Seminario("Como ser um bite programador");
        Professor prof = new Professor("Yoda", "Usar a forca para programa");
        Local local = new Local("Rua das araras", "Mato");

        //esse é o passo da associação, vou falar que o aluno William vai participar do seminário Como ser...
        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);

        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAlunos(new Aluno[]{aluno,aluno2});

        /*Seminario[] semArray = new Seminario[1];
        semArray[0]=sem;
        prof.setSeminarios(semArray);*/
        //esse código acima pode ficar assim
        prof.setSeminarios(new Seminario[]{sem});

        //relatorios
        sem.print();
        prof.print();
    }
}
