package br.edu.up.modelos;

public class Comissario extends Tripulacao {
    private List<String> idiomasFluencia;

    public Comissario(String nome, String rg, Aeronave aeronave, String identificacaoAeronautica, String matriculaFuncionario, List<String> idiomasFluencia) {
        super(nome, rg, aeronave, identificacaoAeronautica, matriculaFuncionario);
        this.idiomasFluencia = idiomasFluencia;
    }
}
