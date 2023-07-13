package org.supera.desafio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        List<String> texts = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Long textsLength = scanner.nextLong();
        scanner.nextLine();
        for (int i = 0; i < textsLength; i++ ){
            String text = scanner.nextLine();
            while(text.length() < 2 || text.length() > 100){
                System.out.println("Texto invalido");
                text = scanner.next();
            }
            texts.add(text);
        }

        for (String text: texts) {
            int halfLength = text.length() / 2;
            String revertFirstHalf = new StringBuilder(text.substring(0, halfLength)).reverse().toString();
            String revertFinalHalf = new StringBuilder(text.substring(halfLength)).reverse().toString();
            System.out.println(revertFirstHalf + revertFinalHalf);
        }
    }
}