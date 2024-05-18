package br.edu.up.modelos;

import java.time.LocalDate;

abstract class Seguro {
    private String apolice;
    private Segurado segurado;
    private double vlrApolice;
    private LocalDate dtaInicio;
    private LocalDate dtaFim;

    // Construtor, getters e setters

    public abstract String getDados();
}
