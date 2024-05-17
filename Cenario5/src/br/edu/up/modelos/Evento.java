package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.Date;

public class Evento {
    private String nome;
    private Date data;
    private String local;
    private int lotacaoMaxima;
    private int ingressosVendidos;
    private double precoIngresso;
    private ArrayList<Reserva> reservas;

    public Evento(String nome, Date data, String local, int lotacaoMaxima, double precoIngresso) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.lotacaoMaxima = lotacaoMaxima;
        this.ingressosVendidos = 0;
        this.precoIngresso = precoIngresso;
        this.reservas = new ArrayList<>();
    }

    // Getters and setters
    // ...
    
    public boolean addReserva(Reserva reserva) {
        if (ingressosVendidos + reserva.getQuantidadePessoas() <= lotacaoMaxima) {
            reservas.add(reserva);
            ingressosVendidos += reserva.getQuantidadePessoas();
            return true;
        }
        return false;
    }

    public void removeReserva(Reserva reserva) {
        reservas.remove(reserva);
        ingressosVendidos -= reserva.getQuantidadePessoas();
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    @Override
    public String toString() {
        return "Evento [Nome: " + nome + ", Data: " + data + ", Local: " + local + 
               ", Lotação Máxima: " + lotacaoMaxima + ", Ingressos Vendidos: " + ingressosVendidos + 
               ", Preço do Ingresso: " + precoIngresso + "]";
    }
}

