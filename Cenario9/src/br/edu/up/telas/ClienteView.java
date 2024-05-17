package br.edu.up.telas;

class ClienteView {
    
    private ClienteController controller;
    private Scanner scanner;

    public ClienteView(ClienteController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Incluir cliente pessoa");
            System.out.println("2. Incluir cliente empresa");
            System.out.println("3. Mostrar dados cliente pessoa");
            System.out.println("4. Mostrar dados cliente empresa");
            System.out.println("5. Emprestar para cliente pessoa");
            System.out.println("6. Emprestar para cliente empresa");
            System.out.println("7. Devolução de cliente pessoa");
            System.out.println("8. Devolução de cliente empresa");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    incluirClientePessoa();
                    break;
                case 2:
                    incluirClienteEmpresa();
                    break;
                case 3:
                    mostrarDadosClientePessoa();
                    break;
                case 4:
                    mostrarDadosClienteEmpresa();
                    break;
                case 5:
                    emprestarClientePessoa();
                    break;
                case 6:
                    emprestarClienteEmpresa();
                    break;
                case 7:
                    devolverClientePessoa();
                    break;
                case 8:
                    devolverClienteEmpresa();
                    break;
                case 9:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 9);
        scanner.close();
    }

    private void incluirClientePessoa() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        // Leitura dos outros dados do cliente pessoa
        // ...
        controller.incluirClientePessoa(nome, ...);
    }

    private void incluirClienteEmpresa() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        // Leitura dos outros dados do cliente empresa
        // ...
        controller.incluirClienteEmpresa(nome, ...);
    }

    private void mostrarDadosClientePessoa() {
        System.out.print("Nome do cliente pessoa: ");
        String nome = scanner.nextLine();
        controller.mostrarDadosClientePessoa(nome);
    }

    private void mostrarDadosClienteEmpresa() {
        System.out.print("Nome do cliente empresa: ");
        String nome = scanner.nextLine();
        controller.mostrarDadosClienteEmpresa(nome);
    }

    private void emprestarClientePessoa() {
        System.out.print("Nome do cliente pessoa: ");
        String nome = scanner.nextLine();
        System.out.print("Valor a emprestar: ");
        double valor = scanner.nextDouble();
        controller.emprestarClientePessoa(nome, valor);
    }

    private void emprestarClienteEmpresa() {
        System.out.print("Nome do cliente empresa: ");
        String nome = scanner.nextLine();
        System.out.print("Valor a emprestar: ");
        double valor = scanner.nextDouble();
        controller.emprestarClienteEmpresa(nome, valor);
    }

    private void devolverClientePessoa() {
        System.out.print("Nome do cliente pessoa: ");
        String nome = scanner.nextLine();
        System.out.print("Valor a devolver: ");
        double valor = scanner.nextDouble();
        controller.devolverClientePessoa(nome, valor);
    }

    private void devolverClienteEmpresa() {
        System.out.print("Nome do cliente empresa: ");
        String nome = scanner.nextLine();
        System.out.print("Valor a devolver: ");
        double valor = scanner.nextDouble();
        controller.devolverClienteEmpresa(nome, valor);
    }
}
