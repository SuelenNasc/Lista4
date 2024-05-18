package br.edu.up;

import java.util.Scanner;
import br.edu.up.controles.ClienteController;

public class Programa {
    public static void main(String[] args) throws Exception{
        ClienteController controller = new ClienteController();
        ClienteView view = new ClienteView(controller);
        view.exibirMenu();
    }
}
