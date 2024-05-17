package br.edu.up;

public class Programa {
    public static void main(String[] args) {
        ControleAeroporto controle = new ControleAeroporto();
        Visao visao = new Visao(controle);
        visao.mostrarMenu();
    }
}

