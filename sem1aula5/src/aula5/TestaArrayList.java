package aula5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestaArrayList {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Leonardo");
        nomes.add("André");
        nomes.add("Maria");
        // nomes.add(123);

        nomes.add(0, "João");

        System.out.println(Collections.max(nomes));
        System.out.println(Collections.min(nomes));

        System.out.println(nomes);
        System.out.println(nomes.size());

        String nome = nomes.get(0);
        System.out.println(nomes.contains("Leonardo"));

        nomes.remove("Leonardo");

        System.out.println(nomes);

        System.out.println(nomes.contains("Leonardo"));

        Collections.sort(nomes);
        System.out.println(nomes);

        System.out.println(Collections.max(nomes));
        System.out.println(Collections.min(nomes));

        Collections.reverse(nomes);
        System.out.println(nomes);

        ArrayList<Integer> anosDeCopa = new ArrayList<>();
    }
}
