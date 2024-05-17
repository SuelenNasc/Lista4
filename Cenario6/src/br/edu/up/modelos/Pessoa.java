package br.edu.up.modelos;

public abstract class Pessoa {
    private String nome;
    private String rg;
    private Aeronave aeronave;

    public Pessoa(String nome, String rg, Aeronave aeronave) {
        this.nome = nome;
        this.rg = rg;
        this.aeronave = aeronave;
    }

}
