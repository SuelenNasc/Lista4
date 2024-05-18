package br.edu.up.controles;

import br.edu.up.modelos.Cliente; 
import br.edu.up.modelos.ClientePessoa; 
import br.edu.up.modelos.ClienteEmpresa; 
import br.edu.up.modelos.Endereco; 
import java.util.HashMap; 

public class ClienteController {
    private HashMap<String, Cliente> clientes;

    public ClienteController() {
        this.clientes = new HashMap<>();
    }

    public void incluirClientePessoa(String nome, String telefone, String email, Endereco endereco, double credito, String CPF, double peso, double altura) {
        ClientePessoa cliente = new ClientePessoa(nome, telefone, email, endereco, credito, CPF, peso, altura);
        clientes.put(nome, cliente);
    }

    public void incluirClienteEmpresa(String nome, String telefone, String email, Endereco endereco, double credito, String CNPJ, String inscEstadual, int anoFundacao) {
        ClienteEmpresa cliente = new ClienteEmpresa(nome, telefone, email, endereco, credito, CNPJ, inscEstadual, anoFundacao);
        clientes.put(nome, cliente);
    }

    public void mostrarDadosClientePessoa(String nome) {
        Cliente cliente = clientes.get(nome);
        if (cliente instanceof ClientePessoa) {
            System.out.println(((ClientePessoa) cliente).getDados());
        } else {
            System.out.println("Cliente não encontrado ou não é uma Pessoa.");
        }
    }

    public void mostrarDadosClienteEmpresa(String nome) {
        Cliente cliente = clientes.get(nome);
        if (cliente instanceof ClienteEmpresa) {
            System.out.println(((ClienteEmpresa) cliente).getDados());
        } else {
            System.out.println("Cliente não encontrado ou não é uma Empresa.");
        }
    }

    public void emprestarClientePessoa(String nome, double valor) {
        Cliente cliente = clientes.get(nome);
        if (cliente instanceof ClientePessoa) {
            cliente.emprestar(valor);
            System.out.println("Valor emprestado com sucesso.");
        } else {
            System.out.println("Cliente não encontrado ou não é uma Pessoa.");
        }
    }

    public void emprestarClienteEmpresa(String nome, double valor) {
        Cliente cliente = clientes.get(nome);
        if (cliente instanceof ClienteEmpresa) {
            cliente.emprestar(valor);
            System.out.println("Valor emprestado com sucesso.");
        } else {
            System.out.println("Cliente não encontrado ou não é uma Empresa.");
        }
    }

    public void devolverClientePessoa(String nome, double valor) {
        Cliente cliente = clientes.get(nome);
        if (cliente instanceof ClientePessoa) {
            double valorDevolvido = cliente.devolver(valor);
            System.out.println("Valor devolvido: R$" + valorDevolvido);
        } else {
            System.out.println("Cliente não encontrado ou não é uma Pessoa.");
        }
    }

    public void devolverClienteEmpresa(String nome, double valor) {
        Cliente cliente = clientes.get(nome);
        if (cliente instanceof ClienteEmpresa) {
            double valorDevolvido = cliente.devolver(valor);
            System.out.println("Valor devolvido: R$" + valorDevolvido);
        } else {
            System.out.println("Cliente não encontrado ou não é uma Empresa.");
        }
    }
}

