package br.edu.up.modelos;

import java.util.HashMap;
import java.util.Map;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Map<String, Mes> meses;

    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new HashMap<>();
    }

    public void adicionarMes(Mes mes) {
        meses.put(mes.getNome(), mes);
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora) {
        if (meses.containsKey(nomeMes)) {
            meses.get(nomeMes).excluirCompromisso(diaMes, hora);
        }
    }

    public String listarCompromissos(String nomeMes) {
        if (meses.containsKey(nomeMes)) {
            return meses.get(nomeMes).toString();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Ano [Ano: " + ano + ", Bissexto: " + bissexto + ", Meses: " + meses.values() + "]";
    }
}
