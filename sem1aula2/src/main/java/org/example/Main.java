package org.example;

import teste.TesteImportacao;

import javax.swing.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");

        int numeroDeCachorros = 2;
        double peso = 7.2;
        System.out.println("O peso da minha cachorra é: " + peso + "kg.");

        boolean ehCastrado = true;

        float altura = 1.75f;
        String nome = "João";
        System.out.printf("Meu nome é %s e minha altura é: %.2f.%n", nome, altura);

        long id = 1230000000000L;
        char primeiraLetraDoNome = 'J';

         int altura2 = (int) 1.75;
        System.out.println("Minha altura é: " + altura2);

        String nomeCompletoDoPai = "João Victor Oliveira";
        Double precoDoCigarroQueOPaiFoiComprar = 8.5;
        precoDoCigarroQueOPaiFoiComprar = null;*/
        //peso = null;

        TesteImportacao teste;

        //String texto = new String("Texto de exemplo");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Essa operação vai ocupar 10MBytes de espaço em disco. Prosseguir? Y/n");
        String decisaoDoUsuario = entrada.nextLine();
        System.out.println("Decisão do usuário: " + decisaoDoUsuario);

        System.out.println("Qual seu nome?");
        String nomeDoUsuario = entrada.nextLine();

        System.out.println("Qual sua idade?");
        int idade = Integer.parseInt(entrada.nextLine());

        System.out.println("Qual sua altura?");
        double altura = Double.parseDouble(entrada.nextLine());

        System.out.format("O usuário %s tem %d anos e mede %.2fm.%n", nomeDoUsuario, idade, altura);
        System.out.printf("O nome %s tem %d caracteres.%n", nomeDoUsuario, nomeDoUsuario.length());
        System.out.println(nomeDoUsuario.toUpperCase());
        System.out.println(nomeDoUsuario.toLowerCase());
        System.out.println(nomeDoUsuario);
        System.out.println("   Testando o Trim   ".trim());
        System.out.println("João".equals("joão"));
        System.out.println("João".equalsIgnoreCase("joão"));
        System.out.println("João".charAt(2));
        System.out.println("João".indexOf('o'));
        System.out.println("João".indexOf('v'));
        System.out.println("João".lastIndexOf('o'));
        System.out.println("testando".replace('t', 'T'));

        String nome = "João Victor";
        int indexDoEspaco = nome.indexOf(" ");

        String segundoNome = nome.substring(indexDoEspaco+1);
        String primeiroNome = nome.substring(0,indexDoEspaco);

        System.out.println("Segundo nome: " + segundoNome);
        System.out.println("Primeiro nome: " + primeiroNome);

        String idadeStr = Integer.toString(idade); // "32"
        double peso = Double.parseDouble("10.5");

        System.out.println(idadeStr);
        System.out.println(peso);
  }
}
