package br.edu.up.modelos;

import java.util.Arrays;

public class Dia {
    private int diaMes;
    private Compromisso[] compromissos;

    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[24]; // 24 horas no dia
    }

    public void adicionarCompromisso(Compromisso comp) {
        if (comp.getHora() >= 0 && comp.getHora() < 24) {
            compromissos[comp.getHora()] = comp;
        }
    }

    public Compromisso consultarCompromisso(int hora) {
        if (hora >= 0 && hora < 24) {
            return compromissos[hora];
        }
        return null;
    }

    public void excluirCompromisso(int hora) {
        if (hora >= 0 && hora < 24) {
            compromissos[hora] = null;
        }
    }

    public String listarCompromissos() {
        return Arrays.toString(compromissos);
    }
}
