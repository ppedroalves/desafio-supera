package org.supera.desafio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        List<Long> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Long arrayLength = scanner.nextLong();
        while(arrayLength < 0 ){
            System.out.println("Digite um valor inteiro postivo");
            arrayLength = scanner.nextLong();
        }

        for(int i = 0; i < arrayLength; i ++){
            Long n = scanner.nextLong();
            while(n < 0 ){
                System.out.println("Digite um valor inteiro postivo");
                n = scanner.nextLong();
            }
            numbers.add(n);
        }

        List<Long> oddNumbers = numbers.stream().filter(x -> x % 2 != 0).sorted(Comparator.reverseOrder()).toList();
        List<Long> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).sorted().toList();

        for (Long evenNumber: evenNumbers) {
            System.out.println(evenNumber);

        }

        for (Long oddNumber: oddNumbers) {
            System.out.println(oddNumber);

        }
    }
}