package org.supera.desafio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        List<Long> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Long tamanhoVetor = scanner.nextLong();
        while(tamanhoVetor < 0 ){
            System.out.println("Digite um valor inteiro postivo");
            tamanhoVetor = scanner.nextLong();
        }

        for(int i = 0; i < tamanhoVetor; i ++){
            Long n = scanner.nextLong();
            while(n < 0 ){
                System.out.println("Digite um valor inteiro postivo");
                n = scanner.nextLong();
            }
            numeros.add(n);
        }

        List<Long> numerosImpares = numeros.stream().filter(x -> x % 2 != 0).sorted(Comparator.reverseOrder()).toList();
        List<Long> numerosPares = numeros.stream().filter(x -> x % 2 == 0).sorted().toList();

        for (Long evenNumber: numerosPares) {
            System.out.println(evenNumber);

        }

        for (Long oddNumber: numerosImpares) {
            System.out.println(oddNumber);

        }
    }
}