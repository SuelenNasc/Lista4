package br.edu.up.modelos;

public class Competencia {
    public enum Tipo { NECESSARIA, COMPLEMENTAR }
    public enum Situacao { ATINGIDA, NAO_ATINGIDA }

    private String descricao;
    private Tipo tipo;
    private Situacao situacao;

    public Competencia(String descricao, Tipo tipo, Situacao situacao) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.situacao = situacao;
    }

}
