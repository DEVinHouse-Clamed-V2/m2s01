package aula3;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idade = 32;
        System.out.println(idade + 1);
        System.out.println("Minha idade é: " + idade + 1);
        System.out.println("Minha idade é: " + (idade + 1));
        System.out.printf("Minha idade é: %d.%n", idade + 1);

        double peso = 85.5;
        peso = peso - 2;

        System.out.println("meu peso é: " + peso);

        double preco = 5.2;
        int quantidade = 3;
        double valorTotalCompra = preco * quantidade;
        System.out.printf("Valor pago: R$%.2f%n", valorTotalCompra);

        int qtdPessoas = 2;
        double valorPagoPorPessoa = valorTotalCompra  / qtdPessoas;
        System.out.printf("Valor por pessoa: R$%.2f%n", valorPagoPorPessoa);

        double restoDaDivisao = valorTotalCompra % qtdPessoas;
        System.out.printf("Resto da divisão do valor por pessoa: %.2f%n", restoDaDivisao);

        double resultado1 = (3 + 4) * 2;
        double resultado2 = (1 + 4) / 2;
        double resultado3 = (6 - 3) % 3;

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);


        // idade = idade + 1;
        // idade += 2;
        // idade++;
        // ++idade;
        System.out.println("idade incrementada: " + ++idade);

        // idade = idade - 1;
        // idade -= 3;
        // idade--;
        // --idade;
        System.out.println("idade decrementada: " + --idade);

        System.out.printf("preço atual: R$%.2f%n", preco);

        // preco = preco * 1.2;
        preco *= 1.2;
        System.out.printf("preço inflacionado em 20%%: R$%.2f%n", preco);

        double resultPow = Math.pow(5, 2);
        System.out.printf("Potência de 5^2: %.2f%n", resultPow);

        double raizQuadrada = Math.sqrt(25);
        System.out.println(raizQuadrada);

        double raizCubica = Math.cbrt(27);
        System.out.println(raizCubica);

        int resultAbs = Math.abs(-10);
        System.out.println(resultAbs);

        double floor = Math.floor(19.9);
        System.out.println(floor);

        double ceil = Math.ceil(20.1);
        System.out.println(ceil);

        double round = Math.round(20.5);
        System.out.println(round);

        System.out.println(Math.PI);

        System.out.println(Math.random());

        double aleatorio = Math.random();
        double aleatorioEntre5e10 = aleatorio * (10 - 5) + 5;
        System.out.printf("Numero aleatorio gerado: %.5f%n", aleatorio);
        System.out.printf("Número aleatório entre 5 e 10: %.2f%n", aleatorioEntre5e10);
        int intAleatorio5e10 = (int) aleatorioEntre5e10;
        System.out.printf("Num. aleat. inteiro: %d%n", intAleatorio5e10);

        int aleatorioEntre10e100 = (int) (Math.random() * (100 - 10) + 10);
        System.out.printf("Num. aleat. int. 10-100: %d%n", aleatorioEntre10e100);

        String str1 = new String("str");
        String str2 = new String("str");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println("str1 é diferente de str2?: " + !str1.equals(str2));
        System.out.println((8==9) && (5>3));
        System.out.println((10>=10) || (9!=9));

        Scanner entrada =  new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idadeUsuario = Integer.parseInt(entrada.nextLine());

        if (idadeUsuario < 0) {
            System.out.println("Idade é obrigatório. Insira algum valor:");
            idadeUsuario = Integer.parseInt(entrada.nextLine());
        } else if (idadeUsuario >= 18) {
            System.out.println("Você já pode tirar a carteira de motorista.");
        } else {
            System.out.println("Você não pode tirar a carteira de motorista.");
        }

        System.out.printf("Sua idade é %d%n", idadeUsuario);

        System.out.println("Qual nome da sua mãe?");
        String nomeDaMae = entrada.nextLine();

        if (nomeDaMae != null && !nomeDaMae.isBlank()) {
            System.out.println(nomeDaMae);
        } else {
            System.out.println("Nome da mãe é obrigatório. Insira algum valor:");
            nomeDaMae = entrada.nextLine();
            System.out.println(nomeDaMae);
        }
  }
}
