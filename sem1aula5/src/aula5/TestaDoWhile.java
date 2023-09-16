package aula5;

import java.util.Scanner;

public class TestaDoWhile {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String userName = "";
        String userPass = "";
        do {
            System.out.println("Nome de usuário e senha não podem ser iguais.");

            System.out.println("Insira um nome de usuário:");
            userName = entrada.nextLine();

            System.out.println("Insira uma senha:");
            userPass = entrada.nextLine();

        } while (userName.equalsIgnoreCase(userPass));

        System.out.printf("Usuário %s criado com sucesso.", userName);
    }


}
