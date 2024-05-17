package br.edu.up;

public class Programa {
    public static void main(String[] args) {
        EventoView eventoView = new EventoView();
        ReservaView reservaView = new ReservaView();
        EventoController eventoController = new EventoController(eventoView);
        ReservaController reservaController = new ReservaController(eventoController, reservaView);
        MenuView menuView = new MenuView();

        boolean executando = true;
        while (executando) {
            int opcao = menuView.exibirMenu();
            switch (opcao) {
                case 1:
                    eventoController.incluirEvento();
                    break;
                case 2:
                    // eventoController.alterarEvento();
                    break;
                case 3:
                    eventoController.listarEventos();
                    break;
                case 4:
                    // eventoController.excluirEvento();
                    break;
                case 5:
                    reservaController.incluirReserva();
                    break;
                case 6:
                    // reservaController.alterarReserva();
                    break;
                case 7:
                    reservaController.listarReservas();
                    break;
                case 8:
                    // reservaController.excluirReserva();
                    break;
                case 9:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
