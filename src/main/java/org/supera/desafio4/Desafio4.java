package org.supera.desafio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        List<String> textos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Long quantidadeTextos = scanner.nextLong();
        scanner.nextLine();
        for (int i = 0; i < quantidadeTextos; i++ ){
            String texto = scanner.nextLine();
            while(texto.length() < 2 || texto.length() > 100){
                System.out.println("Texto invalido");
                texto = scanner.next();
            }
            textos.add(texto);
        }

        for (String texto: textos) {
            int metadeTamanhoTexto = texto.length() / 2;
            String primeiraMetade = new StringBuilder(texto.substring(0, metadeTamanhoTexto)).reverse().toString();
            String metadeFinal = new StringBuilder(texto.substring(metadeTamanhoTexto)).reverse().toString();
            System.out.println(primeiraMetade + metadeFinal);
        }
    }
}