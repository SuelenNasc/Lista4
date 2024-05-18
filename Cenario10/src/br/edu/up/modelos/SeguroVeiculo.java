package br.edu.up.modelos;

class SeguroVeiculo extends Seguro {
    private double vlrFranquia;
    private boolean temCarroReserva;
    private boolean cobreVidros;

    @Override
    public String getDados() {
        return "SeguroVeiculo{" +
                "vlrFranquia=" + vlrFranquia +
                ", temCarroReserva=" + temCarroReserva +
                ", cobreVidros=" + cobreVidros +
                '}';
    }
}