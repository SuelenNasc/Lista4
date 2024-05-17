package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;

public class ControleAeroporto {
    private List<Pessoa> pessoas;

    public ControleAeroporto() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public List<Pessoa> listarPessoas() {
        return pessoas;
    }
}
