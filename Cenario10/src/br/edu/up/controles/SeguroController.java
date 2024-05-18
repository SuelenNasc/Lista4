package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeguroController {
    private List<Seguro> seguros;
    private Scanner scanner;

    public SeguroController() {
        seguros = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void incluirSeguro(Seguro seguro) {
        System.out.println("Informe o número da apólice:");
        String numeroApolice = scanner.nextLine();

        for (Seguro s : seguros) {
            if (s.getApolice().equals(numeroApolice)) {
                System.out.println("Esta apólice já foi inserida.");
                return;
            }
        }

        seguro.setApolice(numeroApolice);
        seguros.add(seguro);
        System.out.println("Seguro incluído com sucesso.");
    }
}

