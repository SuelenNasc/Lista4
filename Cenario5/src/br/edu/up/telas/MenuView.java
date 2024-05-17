package br.edu.up.telas;

import java.util.Scanner;

public class MenuView {
    private Scanner scanner = new Scanner(System.in);

    public int exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Incluir Evento");
        System.out.println("2. Alterar Evento");
        System.out.println("3. Listar Eventos");
        System.out.println("4. Excluir Evento");
        System.out.println("5. Incluir Reserva");
        System.out.println("6. Alterar Reserva");
        System.out.println("7. Listar Reservas");
        System.out.println("8. Excluir Reserva");
        System.out.println("9. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }
}

