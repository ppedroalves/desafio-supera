package org.supera.desafio2;

import org.supera.desafio2.domain.ValorMonetario;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        List<ValorMonetario> valores = Arrays.asList(
                new ValorMonetario("nota", 100.0),
                new ValorMonetario("nota", 50.0),
                new ValorMonetario("nota", 20.0),
                new ValorMonetario("nota", 10.0),
                new ValorMonetario("nota", 5.0),
                new ValorMonetario("nota", 2.0),
                new ValorMonetario("moeda", 1.0),
                new ValorMonetario("moeda", 0.5),
                new ValorMonetario("moeda", 0.25),
                new ValorMonetario("moeda", 0.10),
                new ValorMonetario("moeda", 0.05),
                new ValorMonetario("moeda", 0.01)
        );
        Scanner scanner = new Scanner(System.in);
        Double valor = scanner.nextDouble();
        Double valorAtual = 0.0;
        for (ValorMonetario v : valores) {
            while((valorAtual + v.getValor()) <= valor){
                valorAtual = valorAtual + v.getValor();
                v.addQuantidade();
            }
        }

        printSaida(valores);

    }

    private static void printSaida(List<ValorMonetario> valores){
        List<ValorMonetario> notas = valores.stream().filter(x -> Objects.equals(x.getTipo(), "nota")).toList();
        List<ValorMonetario> moedas = valores.stream().filter(x -> Objects.equals(x.getTipo(), "moeda")).toList();

        System.out.println("NOTAS:");
        notas.stream().forEach(
                x -> System.out.println(x.toString()));
        System.out.println("MOEDAS:");
        moedas.stream().forEach(
                x -> System.out.println(x.toString()));

    }


}