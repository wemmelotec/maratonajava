package br.com.abc.javacore.ZZFstreams.test;

import br.com.abc.javacore.ZZFstreams.classes.Aluno;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTestAluno {
    public static void main(String[] args) {
        List<Aluno> listaDeAlunos = Aluno.bancoDeAlunos();
        listaDeAlunos.stream().forEach(aluno -> System.out.println(aluno.getNome()));
        System.out.println("********************");
        listaDeAlunos.stream()
                .sorted(Comparator.comparing(Aluno::getNome))
                .forEach(aluno -> System.out.println(aluno.getNome()));
        System.out.println("********************");
        List<String> alunosAprovados = listaDeAlunos
                .stream()
                .filter(aluno -> aluno.getNota()>5)
                .map(Aluno::getNome)
                .collect(Collectors.toList());
        alunosAprovados
                .stream()
                .forEach(System.out::println);
    }
}
