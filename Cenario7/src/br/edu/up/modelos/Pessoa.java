package br.edu.up.modelos;

public abstract class Pessoa {
    protected String nome;
    protected String rg;
    protected String matricula;

    public Pessoa(String nome, String rg, String matricula) {
        this.nome = nome;
        this.rg = rg;
        this.matricula = matricula;
    }
}
