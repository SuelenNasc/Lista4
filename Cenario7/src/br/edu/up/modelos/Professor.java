package br.edu.up.modelos;

public class Professor extends Pessoa {
    private String lattesId;
    private String titulacaoInstituicao;
    private int anoConclusao;
    private String tituloObtido;
    private String tituloTrabalho;

    public Professor(String nome, String rg, String matricula, String lattesId, String titulacaoInstituicao,
                     int anoConclusao, String tituloObtido, String tituloTrabalho) {
        super(nome, rg, matricula);
        this.lattesId = lattesId;
        this.titulacaoInstituicao = titulacaoInstituicao;
        this.anoConclusao = anoConclusao;
        this.tituloObtido = tituloObtido;
        this.tituloTrabalho = tituloTrabalho;
    }

}

