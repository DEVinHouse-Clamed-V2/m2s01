package aula5;

import java.util.Arrays;

public class TestaArray {
    public static void main(String[] args){
        int[] anosDeCopa = {2022, 2018, 2014, 2010, 2006, 2002};

        System.out.println(anosDeCopa);
        for (int i = 0; i < anosDeCopa.length; i++) {
            System.out.println(anosDeCopa[i]);
        }

        String[] nomes = new String[5];
        nomes[0] = "Marcelo";
        nomes[1] = "Alvaro";
        nomes[2] = "Augusto";
        nomes[3] = "Henrique";
        nomes[4] = "Marconi";

        System.out.println(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        Arrays.sort(anosDeCopa);
        int index = Arrays.binarySearch(anosDeCopa, 2002);

        System.out.println(index);
    }
}
