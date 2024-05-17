package br.edu.up;

import br.edu.up.controles.SistemaEstacionamentoController;
import br.edu.up.modelos.Estacionamento;
import br.edu.up.telas.SistemaEstacionamentoView;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws Exception {

        Estacionamento estacionamento = new Estacionamento();
        SistemaEstacionamentoView view = new SistemaEstacionamentoView();
        SistemaEstacionamentoController controller = new SistemaEstacionamentoController(estacionamento, view);

        boolean sair = false;
        while (!sair) {
            System.out.println("==== Menu Sistema de Estacionamento ====");
            System.out.println("1. Estacionar Veículo");
            System.out.println("2. Recuperar Veículo");
            System.out.println("3. Sair");
            System.out.println("=======================================");
            System.out.println("Escolha uma opção:");

            int escolha = view.scanner.nextInt();
            view.scanner.nextLine(); // Consumir nova linha

            switch (escolha) {
                case 1:
                    controller.estacionarVeiculo();
                    break;
                case 2:
                    controller.recuperarVeiculo();
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    view.mostrarMensagem("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }

        System.out.println("Programa encerrado.");
    }
}
