package ex06;
import java.util.Scanner;

public class main {

public static void main (String[] args) {
    ListaContatos lista = new ListaContatos();
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1. Adicionar Contato");
        System.out.println("2. Remover Contato");
        System.out.println("3. Buscar Contato por Nome");
        System.out.println("4. Sair");
        System.out.print("Opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer

        switch (opcao) {
            case 1:
                System.out.print("Nome do contato: ");
                String nome = scanner.nextLine();
                System.out.print("Telefone do contato: ");
                String telefone = scanner.nextLine();
                lista.adicionarContato(nome, telefone);
                break;
            case 2:
                System.out.print("Nome do contato a remover: ");
                String nomeRemover = scanner.nextLine();
                lista.removerContato(nomeRemover);
                break;
            case 3:
                System.out.print("Nome do contato a buscar: ");
                String nomeBuscar = scanner.nextLine();
                lista.buscarContato(nomeBuscar);
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    } while (opcao != 4);

    scanner.close();
}
}