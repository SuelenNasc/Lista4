package br.edu.up;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws Exception{
        ClienteController controller = new ClienteController();
        ClienteView view = new ClienteView(controller);
        view.exibirMenu();
    }
}
