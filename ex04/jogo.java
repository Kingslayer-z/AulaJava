package ex04;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Jogador> jogadores = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar jogador");
            System.out.println("2. Atualizar informações do jogador");
            System.out.println("3. Exibir informações dos jogadores");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do jogador: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a pontuação do jogador: ");
                    int pontuacao = scanner.nextInt();
                    System.out.print("Digite o nível do jogador: ");
                    int nivel = scanner.nextInt();
                    Jogador novoJogador = new Jogador(nome, pontuacao, nivel);
                    jogadores.add(novoJogador);
                    System.out.println("Jogador adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o índice do jogador que deseja atualizar: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < jogadores.size()) {
                        Jogador jogador = jogadores.get(indice);
                        System.out.print("Digite a nova pontuação do jogador: ");
                        pontuacao = scanner.nextInt();
                        jogador.atualizarPontuacao(pontuacao);
                        System.out.print("Digite o novo nível do jogador: ");
                        nivel = scanner.nextInt();
                        jogador.atualizarNivel(nivel);
                        System.out.println("Informações do jogador atualizadas com sucesso!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
                case 3:
                    System.out.println("\nInformações dos jogadores:");
                    for (int i = 0; i < jogadores.size(); i++) {
                        Jogador jogador = jogadores.get(i);
                        System.out.println("Índice: " + i);
                        System.out.println("Nome: " + jogador.getNome());
                        System.out.println("Pontuação: " + jogador.getPontuacao());
                        System.out.println("Nível: " + jogador.getNivel());
                        System.out.println();
                    }
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        
        scanner.close();
    }
}