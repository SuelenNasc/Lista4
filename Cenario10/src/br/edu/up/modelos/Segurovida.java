package br.edu.up.modelos;

class SeguroVida extends Seguro {
    private boolean cobreDoenca;
    private boolean cobreAcidente;

    @Override
    public String getDados() {
        return "SeguroVida{" +
                "cobreDoenca=" + cobreDoenca +
                ", cobreAcidente=" + cobreAcidente +
                '}';
    }
}