package br.edu.up.telas;

import java.util.Scanner;
import java.util.Date;

public class ReservaView {
    private Scanner scanner = new Scanner(System.in);

    public Reserva criarReserva(double precoIngresso) {
        System.out.println("Criar nova reserva:");
        System.out.print("Nome do responsável: ");
        String nomeResponsavel = scanner.nextLine();
        System.out.print("Quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha
        Date dataReserva = new Date();
        double valorTotal = quantidadePessoas * precoIngresso;
        return new Reserva(nomeResponsavel, quantidadePessoas, dataReserva, valorTotal);
    }

    public void listarReservas(ArrayList<Reserva> reservas) {
        System.out.println("Lista de reservas:");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
}

