package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private static final int CAPACIDADE_MAXIMA = 10;
    private List<Veiculo> veiculosEstacionados;

    public Estacionamento() {
        this.veiculosEstacionados = new ArrayList<>();
    }

    public boolean estaLotado() {
        return veiculosEstacionados.size() >= CAPACIDADE_MAXIMA;
    }

    public void estacionarVeiculo(Veiculo veiculo) {
        if (!estaLotado()) {
            veiculosEstacionados.add(veiculo);
            System.out.println("Veículo estacionado com sucesso.");
        } else {
            System.out.println("Estacionamento lotado. Não é possível estacionar o veículo.");
        }
    }

    public Veiculo recuperarVeiculo(String placa) {
        for (Veiculo veiculo : veiculosEstacionados) {
            if (veiculo.getPlaca().equals(placa)) {
                veiculosEstacionados.remove(veiculo);
                return veiculo;
            }
        }
        return null;
    }

    public int getTotalVeiculosEstacionados() {
        return veiculosEstacionados.size();
    }
}
