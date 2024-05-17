package br.edu.up.controles;
import java.util.ArrayList;

public class ReservaController {
    private EventoController eventoController;
    private ReservaView reservaView;

    public ReservaController(EventoController eventoController, ReservaView reservaView) {
        this.eventoController = eventoController;
        this.reservaView = reservaView;
    }

    public void incluirReserva() {
        System.out.print("Informe o nome do evento para a reserva: ");
        Scanner scanner = new Scanner(System.in);
        String nomeEvento = scanner.nextLine();

        Evento evento = eventoController.buscarEventoPorNome(nomeEvento);
        if (evento != null) {
            Reserva reserva = reservaView.criarReserva(evento.getPrecoIngresso());
            if (evento.addReserva(reserva)) {
                System.out.println("Reserva realizada com sucesso!");
            } else {
                System.out.println("Não há vagas suficientes.");
            }
        } else {
            System.out.println("Evento não encontrado.");
        }
    }

    public void listarReservas() {
        System.out.print("Informe o nome do evento para listar reservas: ");
        Scanner scanner = new Scanner(System.in);
        String nomeEvento = scanner.nextLine();

        Evento evento = eventoController.buscarEventoPorNome(nomeEvento);
        if (evento != null) {
            reservaView.listarReservas(evento.getReservas());
        } else {
            System.out.println("Evento não encontrado.");
        }
    }

}
