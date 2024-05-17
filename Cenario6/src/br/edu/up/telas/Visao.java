package br.edu.up.telas;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Visao {
    private ControleAeroporto controle;

    public Visao(ControleAeroporto controle) {
        this.controle = controle;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Controle de Tráfego Aéreo");
            System.out.println("1. Adicionar Passageiro");
            System.out.println("2. Adicionar Comandante");
            System.out.println("3. Adicionar Comissário");
            System.out.println("4. Listar Pessoas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a linha

            switch (opcao) {
                case 1:
                    adicionarPassageiro(scanner);
                    break;
                case 2:
                    adicionarComandante(scanner);
                    break;
                case 3:
                    adicionarComissario(scanner);
                    break;
                case 4:
                    listarPessoas();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    private void adicionarPassageiro(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        Aeronave aeronave = criarAeronave(scanner);
        System.out.print("Identificador de Bagagem: ");
        String identificadorBagagem = scanner.nextLine();
        Passagem passagem = criarPassagem(scanner);
        Passageiro passageiro = new Passageiro(nome, rg, aeronave, identificadorBagagem, passagem);
        controle.adicionarPessoa(passageiro);
    }

    private void adicionarComandante(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        Aeronave aeronave = criarAeronave(scanner);
        System.out.print("Identificação Aeronáutica: ");
        String identificacaoAeronautica = scanner.nextLine();
        System.out.print("Matrícula do Funcionário: ");
        String matriculaFuncionario = scanner.nextLine();
        System.out.print("Total de Horas de Voo: ");
        int totalHorasVoo = scanner.nextInt();
        scanner.nextLine();  // Consumir a linha
        Comandante comandante = new Comandante(nome, rg, aeronave, identificacaoAeronautica, matriculaFuncionario, totalHorasVoo);
        controle.adicionarPessoa(comandante);
    }

    private void adicionarComissario(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        Aeronave aeronave = criarAeronave(scanner);
        System.out.print("Identificação Aeronáutica: ");
        String identificacaoAeronautica = scanner.nextLine();
        System.out.print("Matrícula do Funcionário: ");
        String matriculaFuncionario = scanner.nextLine();
        System.out.print("Idiomas em que possui fluência (separados por vírgula): ");
        String[] idiomas = scanner.nextLine().split(",");
        Comissario comissario = new Comissario(nome, rg, aeronave, identificacaoAeronautica, matriculaFuncionario, Arrays.asList(idiomas));
        controle.adicionarPessoa(comissario);
    }

    private Aeronave criarAeronave(Scanner scanner) {
        System.out.print("Código da Aeronave: ");
        String codigo = scanner.nextLine();
        System.out.print("Tipo da Aeronave: ");
        String tipo = scanner.nextLine();
        System.out.print("Quantidade de Assentos: ");
        int quantidadeAssentos = scanner.nextInt();
        scanner.nextLine();  // Consumir a linha
        return new Aeronave(codigo, tipo, quantidadeAssentos);
    }

    private Passagem criarPassagem(Scanner scanner) {
        System.out.print("Número do Assento: ");
        String numeroAssento = scanner.nextLine();
        System.out.print("Classe do Assento: ");
        String classeAssento = scanner.nextLine();
        System.out.print("Data do Voo (AAAA-MM-DDTHH:MM): ");
        String dataVooString = scanner.nextLine();
        LocalDateTime dataVoo = LocalDateTime.parse(dataVooString);
        return new Passagem(numeroAssento, classeAssento, dataVoo);
    }

    private void listarPessoas() {
        for (Pessoa pessoa : controle.listarPessoas()) {
            System.out.println(pessoa);
        }
    }
}

