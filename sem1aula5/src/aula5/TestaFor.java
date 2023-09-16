package aula5;

import java.util.Scanner;

public class TestaFor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira seu nome:");
        String nome = entrada.nextLine();

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }
  }
}
