package br.edu.up.telas;

import java.util.Scanner;
import java.util.Date;

public class EventoView {
    private Scanner scanner = new Scanner(System.in);

    public Evento criarEvento() {
        System.out.println("Criar novo evento:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Data (yyyy-mm-dd): ");
        Date data = Date.valueOf(scanner.nextLine());
        System.out.print("Local: ");
        String local = scanner.nextLine();
        System.out.print("Lotação máxima: ");
        int lotacaoMaxima = scanner.nextInt();
        System.out.print("Preço do ingresso: ");
        double precoIngresso = scanner.nextDouble();
        scanner.nextLine(); // Consumir nova linha
        return new Evento(nome, data, local, lotacaoMaxima, precoIngresso);
    }

    public void listarEventos(ArrayList<Evento> eventos) {
        System.out.println("Lista de eventos:");
        for (Evento evento : eventos) {
            System.out.println(evento);
        }
    }

}
