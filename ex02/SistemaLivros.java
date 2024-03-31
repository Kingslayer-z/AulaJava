package ex02;
import java.util.ArrayList;
import java.util.Scanner;



public class SistemaLivros {
    static ArrayList<Livro> biblioteca = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("Sistema de Gerenciamento de Livros");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Exibir informações de livros");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    exibirInformacoesLivros();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    private static void adicionarLivro() {
        System.out.println("Adicionar Livro");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ano de Publicação: ");
        int anoPublicacao = scanner.nextInt();
        scanner.nextLine();

        Livro livro = new Livro(titulo, autor, anoPublicacao);
        biblioteca.add(livro);
        System.out.println("Livro adicionado com sucesso.");
    }

    private static void exibirInformacoesLivros() {
        System.out.println("Informações dos Livros na Biblioteca:");
        if (biblioteca.isEmpty()) {
            System.out.println("Biblioteca vazia.");
        } else {
            for (Livro livro : biblioteca) {
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
                System.out.println();
            }
        }
    }
}