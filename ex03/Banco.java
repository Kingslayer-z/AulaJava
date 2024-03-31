package ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ContaBancaria> contas = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Criar conta");
            System.out.println("2. Selecionar conta");
            System.out.println("3. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do titular da conta:");
                    scanner.nextLine();
                    String novoTitular = scanner.nextLine();
                    contas.add(new ContaBancaria(novoTitular));
                    System.out.println("Conta criada com sucesso.");
                    break;
                case 2:
                    if (contas.isEmpty()) {
                        System.out.println("Nenhuma conta cadastrada.");
                        break;
                    }
                    System.out.println("Contas disponíveis:");
                    for (int i = 0; i < contas.size(); i++) {
                        System.out.println((i + 1) + ". " + contas.get(i).getTitular());
                    }
                    System.out.println("Escolha o número da conta:");
                    int escolha = scanner.nextInt();
                    if (escolha > 0 && escolha <= contas.size()) {
                        manipularConta(contas.get(escolha - 1), scanner);
                    } else {
                        System.out.println("Conta inválida.");
                    }
                    break;
                case 3:
                    System.out.println("Finalizando o programa!!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    public static void manipularConta(ContaBancaria conta, Scanner scanner) {
        int opcao;
        do {
            System.out.println("\nEscolha uma opção para " + conta.getTitular() + ":");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver Saldo");
            System.out.println("4. Voltar");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a depositar:");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.println("Digite o valor a sacar:");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.exibirSaldo();
                    break;
                case 4:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }
}