package br.edu.up.modelos;

public class Comandante extends Tripulacao {
    private int totalHorasVoo;

    public Comandante(String nome, String rg, Aeronave aeronave, String identificacaoAeronautica, String matriculaFuncionario, int totalHorasVoo) {
        super(nome, rg, aeronave, identificacaoAeronautica, matriculaFuncionario);
        this.totalHorasVoo = totalHorasVoo;
    }

}

