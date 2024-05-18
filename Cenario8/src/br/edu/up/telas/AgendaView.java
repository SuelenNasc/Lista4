package br.edu.up.telas;

import java.util.Scanner;

class AgendaView {
    private Scanner scanner;

    public AgendaView() {
        this.scanner = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("1. Incluir um contato pessoal");
        System.out.println("2. Incluir um contato comercial");
        System.out.println("3. Excluir um contato pelo código");
        System.out.println("4. Consultar um contato pelo código");
        System.out.println("5. Listar todos os contatos");
        System.out.println("6. Sair do programa");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public void closeScanner() {
        scanner.close();
    }

    public int lerCodigo() {
        System.out.print("Digite o código: ");
        return scanner.nextInt();
    }

    public String lerNome() {
        System.out.print("Digite o nome: ");
        scanner.nextLine(); // Limpa o buffer
        return scanner.nextLine();
    }

    public String lerTelefone() {
        System.out.print("Digite o telefone: ");
        return scanner.next();
    }

    public String lerAniversario() {
        System.out.print("Digite o aniversário: ");
        return scanner.next();
    }

    public String lerCnpj() {
        System.out.print("Digite o CNPJ: ");
        return scanner.next();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}

