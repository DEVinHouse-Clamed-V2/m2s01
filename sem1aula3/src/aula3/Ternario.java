package aula3;

public class Ternario {
    public static void main(String[] args){
        int idade = 18;

        String maioridade = idade >= 18 ? "você é maior de idade" : "você é menor de idade";

        System.out.println(maioridade);

        double num = 4;

        boolean ehPar = num % 2 == 0;// ? true : false;

        String parOuImpar = num % 2 == 0 ? "par" : "ímpar";

        System.out.printf("O número %d é %s", num, parOuImpar);
    }
}
