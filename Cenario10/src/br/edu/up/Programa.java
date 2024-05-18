package br.edu.up;
import java.util.Scanner;
import br.edu.up.controles.SeguroController;
import br.edu.up.telas.SeguroView;
public class Programa {
    public static void main(String[] args) throws Exception  {
        SeguroController controller = new SeguroController();
        SeguroView view = new SeguroView();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.exibirMenu();
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    
                    break;
                case 2:
                   
                    break;
                case 3:
                  
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                
                    break;
                case 7:
                    System.out.println("Encerrando o programa.");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
