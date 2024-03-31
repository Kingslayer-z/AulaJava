package ex05;

import java.util.ArrayList;
import java.util.Scanner;


public class main {
public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Carro> carros = new ArrayList<>();

    while (true) {
        System.out.println("Menu:");
        System.out.println("1. Adicionar Carro");
        System.out.println("2. Acelerar Carro");
        System.out.println("3. Frear Carro");
        System.out.println("4. Exibir Detalhes do Carro");
        System.out.println("5. Sair");

        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite a marca do carro: ");
                String marca = scanner.next();
                System.out.print("Digite o modelo do carro: ");
                String modelo = scanner.next();
                System.out.print("Digite o ano do carro: ");
                int ano = scanner.nextInt();

                Carro novoCarro = new Carro(marca, modelo, ano);
                carros.add(novoCarro);
                System.out.println("Novo carro adicionado com sucesso!");
                break;
            case 2:
                System.out.print("Digite o índice do carro que deseja acelerar: ");
                int indiceAcelerar = scanner.nextInt();
                if (indiceAcelerar >= 0 && indiceAcelerar < carros.size()) {
                    System.out.print("Digite a quantidade de aceleração: ");
                    double quantidadeAcelerar = scanner.nextDouble();
                    carros.get(indiceAcelerar).acelerar(quantidadeAcelerar);
                } else {
                    System.out.println("Índice inválido!");
                }
                break;
            case 3:
                System.out.print("Digite o índice do carro que deseja frear: ");
                int indiceFrear = scanner.nextInt();
                if (indiceFrear >= 0 && indiceFrear < carros.size()) {
                    System.out.print("Digite a quantidade de frenagem: ");
                    double quantidadeFrear = scanner.nextDouble();
                    carros.get(indiceFrear).frear(quantidadeFrear);
                } else {
                    System.out.println("Índice inválido!");
                }
                break;
            case 4:
                for (int i = 0; i < carros.size(); i++) {
                    System.out.println("Carro " + (i + 1) + ":");
                    carros.get(i).exibirDetalhes();
                    System.out.println();
                }
                break;
            case 5:
                System.out.println("Finalizando o programa!!");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Opção inválida!");
        }
    }
}
}
