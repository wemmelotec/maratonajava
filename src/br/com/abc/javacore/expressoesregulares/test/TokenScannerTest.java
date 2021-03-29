package br.com.abc.javacore.expressoesregulares.test;

import java.util.Scanner;

public class TokenScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("1 true 100 oi");
        //por padrão o delimitador da classe scanner é o espaço
        while (scanner.hasNext()){//verifica primeiro se existe alguém depois do espaço em branco
            System.out.println(scanner.next());
        }

        Scanner scanner1 = new Scanner("1 true 100 oi");
        while (scanner1.hasNext()){
            if(scanner1.hasNextInt()){
                int i = scanner1.nextInt();
                System.out.println(i);
            }else if(scanner1.hasNextBoolean()){
                boolean b = scanner1.nextBoolean();
                System.out.println(b);
            }else {
                String str = scanner1.next();
                System.out.println(str);
            }
        }
    }
}
