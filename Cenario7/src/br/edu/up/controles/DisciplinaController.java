package br.edu.up.controles;

import java.util.List;

public class DisciplinaController {
    private Disciplina disciplina;
    private ConsoleView view;

    public DisciplinaController(Disciplina disciplina, ConsoleView view) {
        this.disciplina = disciplina;
        this.view = view;
    }

    public void avaliarAluno(Aluno aluno) {
        int necessariasAtingidas = 0;
        int complementaresAtingidas = 0;
        int totalNecessarias = 0;
        int totalComplementares = 0;

        for (Competencia c : disciplina.getCompetencias()) {
            if (c.getTipo() == Competencia.Tipo.NECESSARIA) {
                totalNecessarias++;
                if (c.getSituacao() == Competencia.Situacao.ATINGIDA) {
                    necessariasAtingidas++;
                }
            } else {
                totalComplementares++;
                if (c.getSituacao() == Competencia.Situacao.ATINGIDA) {
                    complementaresAtingidas++;
                }
            }
        }

        String status;
        if (necessariasAtingidas == totalNecessarias && complementaresAtingidas >= totalComplementares / 2) {
            status = "Aprovado";
        } else if (necessariasAtingidas < totalNecessarias / 2 || complementaresAtingidas < totalComplementares / 2) {
            status = "Reprovado";
        } else {
            status = "Pendente";
        }

        view.displayAlunoStatus(status);
    }

    public void exibirDisciplina() {
        view.displayDisciplinaInfo(disciplina);
    }
}

