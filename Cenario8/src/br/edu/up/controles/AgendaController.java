package br.edu.up.controles;

import java.util.List; 
import java.util.ArrayList; 
import br.edu.up.modelos.Contato; 
import br.edu.up.modelos.Pessoal;
import br.edu.up.modelos.Comercial;

public class AgendaController {
    private List<Contato> contatos;

    public AgendaController() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarPessoal(int codigo, String nome, String telefone, String aniversario) {
        contatos.add(new Pessoal(codigo, nome, telefone, aniversario));
    }

    public void adicionarComercial(int codigo, String nome, String telefone, String cnpj) {
        contatos.add(new Comercial(codigo, nome, telefone, cnpj));
    }

    public Contato getContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                return contato;
            }
        }
        return null;
    }

    public void excluirContato(int codigo) {
        contatos.removeIf(contato -> contato.getCodigo() == codigo);
    }

    public String listarContatos() {
        StringBuilder sb = new StringBuilder();
        for (Contato contato : contatos) {
            sb.append(contato.toString()).append("\n");
        }
        return sb.toString();
    }
}


