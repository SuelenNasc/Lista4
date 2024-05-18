package br.edu.up.telas;

import br.edu.up.modelos.Veiculo;
import java.util.Scanner;

public class SistemaEstacionamentoView {
    private Scanner scanner;

    public SistemaEstacionamentoView() {
        this.scanner = new Scanner(System.in);
    }

    public Veiculo lerInformacoesVeiculo() {
        System.out.println("Digite o modelo do veículo:");
        String modelo = scanner.nextLine();
        System.out.println("Digite a placa do veículo:");
        String placa = scanner.nextLine();
        System.out.println("Digite a cor do veículo:");
        String cor = scanner.nextLine();
        return new Veiculo(modelo, placa, cor);
    }

    public String lerPlacaParaRecuperar() {
        System.out.println("Digite a placa do veículo para recuperar:");
        return scanner.nextLine();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}

