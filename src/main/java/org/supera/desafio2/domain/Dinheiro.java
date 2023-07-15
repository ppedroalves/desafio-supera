package org.supera.desafio2.domain;

public class Dinheiro {
    private String tipo;
    private Double valor;
    private Long quantidade;

    public Dinheiro(String tipo, Double valor){
        this.tipo = tipo;
        this.valor = valor;
        this.quantidade = 0L;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void addQuantidade(){
        this.quantidade++;
    }

    @Override
    public String toString() {
        return quantidade + " " + tipo + "(s) de R$ " + valor;
    }
}
