package br.edu.up;

import br.edu.up.controles.AgendaController;

public class Programa {
    public static void main(String[] args) {
        AgendaController controller = new AgendaController();
        AgendaView view = new AgendaView();
        boolean sair = false;

        while (!sair) {
            int opcao = view.showMenu();

            switch (opcao) {
                case 1:
                    controller.adicionarPessoal(
                            view.lerCodigo(),
                            view.lerNome(),
                            view.lerTelefone(),
                            view.lerAniversario()
                    );
                    view.mostrarMensagem("Contato pessoal adicionado com sucesso!");
                    break;
                case 2:
                    controller.adicionarComercial(
                            view.lerCodigo(),
                            view.lerNome(),
                            view.lerTelefone(),
                            view.lerCnpj()
                    );
                    view.mostrarMensagem("Contato comercial adicionado com sucesso!");
                    break;
                case 3:
                    int codigoExcluir = view.lerCodigo();
                    controller.excluirContato(codigoExcluir);
                    view.mostrarMensagem("Contato com código " + codigoExcluir + " excluído com sucesso!");
                    break;
                case 4:
                    int codigoConsultar = view.lerCodigo();
                    Contato contato = controller.getContato(codigoConsultar);
                    if (contato != null) {
                        view.mostrarMensagem(contato.toString());
                    } else {
                        view.mostrarMensagem("Contato não encontrado!");
                    }
                    break;
                case 5:
                    String listaContatos = controller.listarContatos();
                    if (!listaContatos.isEmpty()) {
                        view.mostrarMensagem(listaContatos);
                    } else {
                        view.mostrarMensagem("Nenhum contato na agenda!");
                    }
                    break;
                case 6:
                    sair = true;
                    break;
                default:
                    view.mostrarMensagem("Opção inválida!");
            }
        }

        view.closeScanner();
    }
}