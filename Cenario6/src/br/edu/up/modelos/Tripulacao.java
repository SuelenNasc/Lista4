package br.edu.up.modelos;

public abstract class Tripulacao extends Pessoa {
    private String identificacaoAeronautica;
    private String matriculaFuncionario;

    public Tripulacao(String nome, String rg, Aeronave aeronave, String identificacaoAeronautica, String matriculaFuncionario) {
        super(nome, rg, aeronave);
        this.identificacaoAeronautica = identificacaoAeronautica;
        this.matriculaFuncionario = matriculaFuncionario;
    }

}
