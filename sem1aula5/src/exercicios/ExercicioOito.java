package exercicios;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int[] valores = new int[10];

        System.out.println("Digite um valor inicial:");
        valores[0] = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite um valor para a raiz:");
        int raiz = Integer.parseInt(entrada.nextLine());

        int tipo = 0;
        do {
            System.out.println("Digite 1 para PA ou 2 para PG:");
            tipo = Integer.parseInt(entrada.nextLine());
        } while (!(tipo == 1 || tipo == 2));

        for (int i = 1; i < valores.length; i++) {
            if (tipo==1) {
                valores[i] = raiz + valores[i-1];
            } else if (tipo==2) {
                valores[i] = raiz * valores[i-1];
            }
        }

        for (int valor : valores) {
            System.out.println(valor);
        }
    }
}
