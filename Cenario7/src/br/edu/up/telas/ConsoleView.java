package br.edu.up.telas;
import java.util.List;

public class ConsoleView {
    public void displayAlunoStatus(String status) {
        System.out.println("Status do aluno: " + status);
    }

    public void displayDisciplinaInfo(Disciplina disciplina) {
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Professor: " + disciplina.getProfessor().getNome());
        System.out.println("Alunos matriculados:");
        for (Aluno aluno : disciplina.getAlunosMatriculados()) {
            System.out.println(" - " + aluno.getNome());
        }
    }
}
