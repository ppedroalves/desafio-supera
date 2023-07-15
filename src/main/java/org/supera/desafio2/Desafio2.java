package org.supera.desafio2;

import org.supera.desafio2.domain.Dinheiro;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        List<Dinheiro> valores = inicializarNotasEMoedas();
        Scanner scanner = new Scanner(System.in);
        Double value = scanner.nextDouble();
        Double currentValue = 0.0;
        for (Dinheiro v : valores) {
            while((currentValue + v.getValor()) <= value){
                currentValue = currentValue + v.getValor();
                v.addQuantidade();
            }
        }

        print(valores);

    }

    private static void print(List<Dinheiro> valores){
        List<Dinheiro> notas = valores.stream().filter(x -> Objects.equals(x.getTipo(), "nota")).toList();
        List<Dinheiro> moedas = valores.stream().filter(x -> Objects.equals(x.getTipo(), "moeda")).toList();

        System.out.println("NOTAS:");
        notas.stream().forEach(
                x -> System.out.println(x.toString()));
        System.out.println("MOEDAS:");
        moedas.stream().forEach(
                x -> System.out.println(x.toString()));

    }

    private static List<Dinheiro> inicializarNotasEMoedas(){
        return Arrays.asList(
                new Dinheiro("nota", 100.0),
                new Dinheiro("nota", 50.0),
                new Dinheiro("nota", 20.0),
                new Dinheiro("nota", 10.0),
                new Dinheiro("nota", 5.0),
                new Dinheiro("nota", 2.0),
                new Dinheiro("moeda", 1.0),
                new Dinheiro("moeda", 0.5),
                new Dinheiro("moeda", 0.25),
                new Dinheiro("moeda", 0.10),
                new Dinheiro("moeda", 0.05),
                new Dinheiro("moeda", 0.01));
    }


}