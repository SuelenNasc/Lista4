package br.edu.up.modelos;

import java.util.List;

public class Disciplina {
    private String nome;
    private String identificador;
    private String curriculo;
    private List<Competencia> competencias;
    private Professor professor;
    private List<Aluno> alunosMatriculados;

    public Disciplina(String nome, String identificador, String curriculo, List<Competencia> competencias, Professor professor) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.competencias = competencias;
        this.professor = professor;
    }

    public void matricularAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }

    public void registrarCompetenciaAluno(Aluno aluno, Competencia competencia) {

    }
}

