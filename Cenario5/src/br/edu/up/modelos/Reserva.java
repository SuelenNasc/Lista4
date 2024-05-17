package br.edu.up.modelos;

import java.util.Date;

public class Reserva {
    private String nomeResponsavel;
    private int quantidadePessoas;
    private Date dataReserva;
    private double valorTotal;

    public Reserva(String nomeResponsavel, int quantidadePessoas, Date dataReserva, double valorTotal) {
        this.nomeResponsavel = nomeResponsavel;
        this.quantidadePessoas = quantidadePessoas;
        this.dataReserva = dataReserva;
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Reserva [Nome do Responsável: " + nomeResponsavel + 
               ", Quantidade de Pessoas: " + quantidadePessoas + 
               ", Data da Reserva: " + dataReserva + ", Valor Total: " + valorTotal + "]";
    }
}

