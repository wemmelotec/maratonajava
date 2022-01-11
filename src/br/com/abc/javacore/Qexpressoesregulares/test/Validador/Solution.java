package br.com.abc.javacore.Qexpressoesregulares.test.Validador;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UserNameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
