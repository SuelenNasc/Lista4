package br.edu.up.modelos;

import java.util.Arrays;
import br.edu.up.modelos.Compromisso;
import br.edu.up.modelos.Dia;
import br.edu.up.modelos.Ano;


public class Mes {
    private String nome;
    private int qtdeDias;
    private Dia[] dias;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public void setQtdeDias(int qtdeDias) {
        this.qtdeDias = qtdeDias;
    }

    public Dia[] getDias() {
        return dias;
    }

    public void setDias(Dia[] dias) {
        this.dias = dias;
    }

    public Mes(int qtdeDias, String nome) {
        this.nome = nome;
        this.qtdeDias = qtdeDias;
        this.dias = new Dia[qtdeDias];
        for (int i = 0; i < qtdeDias; i++) {
            dias[i] = new Dia(i + 1);
        }
    }

    public void adicionarDia(Dia dia ) {
        if (diaMes > 0 && diaMes <= qtdeDias) {
            dias[diaMes - 1] = dia;
        }
    }

    public void adicionarCompromisso(Compromisso comp, int diaMes) {
        if (diaMes > 0 && diaMes <= qtdeDias) {
            dias[diaMes - 1].adicionarCompromisso(comp);
        }
    }

    public Dia diaMes(int diaMes) {
        if (diaMes > 0 && diaMes <= qtdeDias) {
            return dias[diaMes - 1];
        }
        return null;
    }

    public void excluirCompromisso(int diaMes, int hora) {
        if (diaMes > 0 && diaMes <= qtdeDias) {
            dias[diaMes - 1].excluirCompromisso(hora);
        }
    }

    public String listarCompromissos(int diaMes) {
        if (diaMes > 0 && diaMes <= qtdeDias) {
            return dias[diaMes - 1].listarCompromissos();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Mes [Nome: " + nome + ", Dias: " + Arrays.toString(dias) + "]";
    }
}
