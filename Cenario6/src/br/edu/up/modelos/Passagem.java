package br.edu.up.modelos;

import java.time.LocalDateTime;

public class Passagem {
    private String numeroAssento;
    private String classeAssento;
    private LocalDateTime dataVoo;

    public Passagem(String numeroAssento, String classeAssento, LocalDateTime dataVoo) {
        this.numeroAssento = numeroAssento;
        this.classeAssento = classeAssento;
        this.dataVoo = dataVoo;
    }
}
