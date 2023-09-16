package aula5;

import java.util.Scanner;

public class TestaWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um nome de usuário:");
        String userName = entrada.nextLine();

        System.out.println("Insira uma senha:");
        String userPass = entrada.nextLine();

        while (userName.equalsIgnoreCase(userPass)) {
            System.out.println("Nome de usuário e senha devem ser diferentes.");

            System.out.println("Insira um nome de usuário:");
            userName = entrada.nextLine();

            System.out.println("Insira uma senha:");
            userPass = entrada.nextLine();
        }

        // cadastra usuário

        System.out.printf("Usuário %s foi cadastrado com sucesso.", userName);
    }
}