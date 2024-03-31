package ex07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao estoque!");

        int opcao;
        do {
            System.out.println("\nSelecione a opção desejada:");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Relatório de Estoque");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do produto: ");
                    scanner.nextLine();
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double precoProduto = scanner.nextDouble();
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidadeProduto = scanner.nextInt();
                    estoque.adicionarProduto(nomeProduto, precoProduto, quantidadeProduto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("\nDigite o nome do produto a ser removido: ");
                    scanner.nextLine();
                    String nomeRemover = scanner.nextLine();
                    estoque.removerProduto(nomeRemover);
                    break;
                case 3:
                    estoque.relatorioEstoque();
                    break;
                case 0:
                    System.out.println("Finalizando o programa!!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        
        scanner.close();
    }
}