package br.edu.up;

import java.util.ArrayList;
import java.util.List;


public class Programa {
    public static void main(String[] args) throws Exception{

        Professor professor = new Professor("Dr. João", "123456", "P001", "L123", "UFABC", 2015, "Doutorado", "Tese ABC");
        Aluno aluno1 = new Aluno("Maria", "654321", "A001", 2020, "Engenharia", "Matutino");
        Aluno aluno2 = new Aluno("José", "987654", "A002", 2019, "Computação", "Noturno");

        List<Competencia> competencias = new ArrayList<>();
        competencias.add(new Competencia("Matemática Básica", Competencia.Tipo.NECESSARIA, Competencia.Situacao.ATINGIDA));
        competencias.add(new Competencia("Programação", Competencia.Tipo.NECESSARIA, Competencia.Situacao.NAO_ATINGIDA));
        competencias.add(new Competencia("Trabalho em Equipe", Competencia.Tipo.COMPLEMENTAR, Competencia.Situacao.ATINGIDA));

        Disciplina disciplina = new Disciplina("Algoritmos", "D001", "Currículo ABC", competencias, professor);
        disciplina.matricularAluno(aluno1);
        disciplina.matricularAluno(aluno2);

        ConsoleView view = new ConsoleView();
        DisciplinaController controller = new DisciplinaController(disciplina, view);

        // Exibindo informações da disciplina
        controller.exibirDisciplina();

        // Avaliando os alunos
        controller.avaliarAluno(aluno1);
        controller.avaliarAluno(aluno2);
    }
}

